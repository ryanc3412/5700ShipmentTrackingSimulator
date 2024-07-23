import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.TrackerViewHelper
import com.example.TrackingServer
import kotlinx.coroutines.launch
import java.time.Instant


@Composable
fun ShipmentView(viewHelper: TrackerViewHelper, removeMessage: () -> Unit) {
    Row(Modifier.fillMaxWidth()) {
        Row(Modifier.padding(8.dp).fillMaxWidth()) {
            Column {
                Text("Tracking Shipment: ${viewHelper.id}")
                Text("Type of shipment: ${viewHelper.type}")
                Text("Status: ${viewHelper.status}")
                Text("Location: ${viewHelper.location}")

                Text("Expected Delivery: ${
                    Instant.ofEpochMilli(viewHelper.dateTime)}")
                Text("Shipment Updates: ")
                for (item in viewHelper.update) {
                    Text(item)
                }
                Text("Notes: ")
                for (item in viewHelper.notes) {
                    Text(item)
                }
            }

            Column {
                Button(removeMessage, modifier = Modifier) {
                    Text("X")
                }
            }
        }
    }
}

@Composable
fun App() {

    rememberCoroutineScope().launch { TrackingServer.runSimulation() }
    MaterialTheme {
        var searchVal by remember { mutableStateOf("") }
        val viewHelpers = remember { mutableStateListOf<TrackerViewHelper>() }
        Column (Modifier.fillMaxWidth()){

            Row (Modifier.fillMaxWidth()){
                TextField(searchVal, onValueChange = {searchVal = it}, singleLine = true, modifier = Modifier.weight(1f))
                Button({
                    TrackingServer.findShipment(searchVal)?.let { it1 -> viewHelpers.add(TrackerViewHelper(it1)) }
                    if(TrackingServer.findShipment(searchVal) == null){
                        searchVal = "Invalid. Try again."
                    }
                }) {
                    Text("Search")
                }
            }
            Row (Modifier.fillMaxWidth()){
                LazyColumn(reverseLayout = true) {
                    items(viewHelpers, key = {
                        it
                    }) { viewHelper ->
                        ShipmentView(viewHelper) { viewHelpers.remove(viewHelper) }
                    }
                }
            }
        }

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()

    }
}