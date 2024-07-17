import kotlin.test.Test
import com.example.Shipment

class ShipmentTest {
    @Test
    fun testAddNote() {
        val shipment = Shipment("shipped", "s10000")
        println(shipment.notes)
        shipment.addNote("TEST addNote")
    }



}