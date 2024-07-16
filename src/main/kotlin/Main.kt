import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    var inputText by remember { mutableStateOf("") }
    val submittedTexts = remember { mutableStateListOf<String>() }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TextField(
                value = inputText,
                onValueChange = { inputText = it },
                label = { Text("Enter text") },
                modifier = Modifier.weight(1f)
            )
            Button(onClick = {
                if (inputText.isNotEmpty()) {
                    submittedTexts.add(inputText)
                    inputText = ""
                }
            }) {
                Text("Submit")
            }
        }
        Column(modifier = Modifier.padding(top = 16.dp)) {
            submittedTexts.asReversed().forEach { text ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    backgroundColor = Color.LightGray,
                    shape = RoundedCornerShape(8.dp),
                    elevation = 4.dp
                ) {
                    Box(modifier = Modifier.padding(8.dp)) {
                        Text(text)
                    }
                }
            }
        }
    }
}

//@Composable
//fun Shipment() {
//
//}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
