import kotlin.test.Test
import com.example.Shipment
import kotlin.test.assertEquals

class ShipmentTest {
    @Test
    fun testAddNote() {
        val shipment = Shipment("shipped", "s10000")
        assertEquals(shipment.notes.size, 0)
        shipment.addNote("TEST addNote")
        assertEquals(shipment.notes.size, 1)
        assertEquals(shipment.notes[0], "TEST addNote")
    }
    @Test
    fun testAddUpdate() {
        val shipment = Shipment("delayed", "s10001")
        assertEquals(shipment.updates.size, 0)
        shipment.addUpdate("TEST addUpdate")
        assertEquals(shipment.updates.size, 1)
        assertEquals(shipment.updates[0], "TEST addUpdate")
    }
    @Test
    fun testStatus() {
        val shipment = Shipment("delayed", "s10001")
        shipment.status = "delivered"
        assertEquals(shipment.status, "delivered")
    }
    @Test
    fun testDateTime() {
        val shipment = Shipment("delayed", "s10001")
        shipment.dateTime = 1652712855468
        assertEquals(shipment.dateTime, 1652712855468)
    }
    @Test
    fun testLocation() {
        val shipment = Shipment("delayed", "s10001")
        shipment.location = "Nephi, UT"
        assertEquals(shipment.location, "Nephi, UT")
    }
}