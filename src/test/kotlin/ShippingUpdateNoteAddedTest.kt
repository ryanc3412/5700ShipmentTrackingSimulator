import com.example.Shipment
import com.example.ShippingUpdateNoteAdded
import kotlin.test.Test
import kotlin.test.assertTrue

class ShippingUpdateNoteAddedTest {
    @Test
    fun testNoteIsAdded() {
        val shipment = StandardShipment("In Transit", "12345", 1652712855468)
        val timeStamp = System.currentTimeMillis()
        val note = "Package has been delayed due to weather."
        val shippingUpdateNoteAdded = ShippingUpdateNoteAdded(shipment, timeStamp, note)
        assertTrue(shipment.notes.contains(note))
    }
}