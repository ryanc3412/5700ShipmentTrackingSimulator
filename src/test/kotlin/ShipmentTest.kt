import kotlin.test.Test
import com.example.Shipment
import kotlin.test.assertEquals

class ShipmentTest {
    @Test
    fun testAddNoteStandard() {
        val shipment = StandardShipment("shipped", "s10000", 1652712855468)
        assertEquals(shipment.notes.size, 0)
        shipment.addNote("TEST addNote")
        assertEquals(shipment.notes.size, 1)
        assertEquals(shipment.notes[0], "TEST addNote")
    }
    @Test
    fun testAddUpdateStandard() {
        val shipment = StandardShipment("delayed", "s10001", 1652712855468)
        assertEquals(shipment.updates.size, 0)
        shipment.addUpdate("TEST addUpdate")
        assertEquals(shipment.updates.size, 1)
        assertEquals(shipment.updates[0], "TEST addUpdate")
    }
    @Test
    fun testStatusStandard() {
        val shipment = StandardShipment("delayed", "s10001", 1652712855468)
        shipment.status = "delivered"
        assertEquals(shipment.status, "delivered")
    }
    @Test
    fun testDateTimeStandard() {
        val shipment = StandardShipment("delayed", "s10001",1652712855468)
        shipment.dateTime = 1652712855468
        assertEquals(shipment.dateTime, 1652712855468)
    }
    @Test
    fun testLocationStandard() {
        val shipment = StandardShipment("delayed", "s10001", 1652712855468)
        shipment.location = "Nephi, UT"
        assertEquals(shipment.location, "Nephi, UT")
    }

    @Test
    fun testAddNoteBulk() {
        val shipment = BulkShipment("shipped", "s10000", 1652712855468)
        assertEquals(shipment.notes.size, 0)
        shipment.addNote("TEST addNote")
        assertEquals(shipment.notes.size, 1)
        assertEquals(shipment.notes[0], "TEST addNote")
    }
    @Test
    fun testAddUpdateBulk() {
        val shipment = BulkShipment("delayed", "s10001", 1652712855468)
        assertEquals(shipment.updates.size, 0)
        shipment.addUpdate("TEST addUpdate")
        assertEquals(shipment.updates.size, 1)
        assertEquals(shipment.updates[0], "TEST addUpdate")
    }
    @Test
    fun testStatusBulk() {
        val shipment = BulkShipment("delayed", "s10001", 1652712855468)
        shipment.status = "delivered"
        assertEquals(shipment.status, "delivered")
    }
    @Test
    fun testDateTimeBulk() {
        val shipment = BulkShipment("delayed", "s10001",1652712855468)
        shipment.dateTime = 1652712855468
        assertEquals(shipment.dateTime, 1652712855468)
    }
    @Test
    fun testLocationBulk() {
        val shipment = BulkShipment("delayed", "s10001", 1652712855468)
        shipment.location = "Nephi, UT"
        assertEquals(shipment.location, "Nephi, UT")
    }

    @Test
    fun testAddNoteExpress() {
        val shipment = ExpressShipment("shipped", "s10000", 1652712855468)
        assertEquals(shipment.notes.size, 0)
        shipment.addNote("TEST addNote")
        assertEquals(shipment.notes.size, 1)
        assertEquals(shipment.notes[0], "TEST addNote")
    }
    @Test
    fun testAddUpdateExpress() {
        val shipment = ExpressShipment("delayed", "s10001", 1652712855468)
        assertEquals(shipment.updates.size, 0)
        shipment.addUpdate("TEST addUpdate")
        assertEquals(shipment.updates.size, 1)
        assertEquals(shipment.updates[0], "TEST addUpdate")
    }
    @Test
    fun testStatusExpress() {
        val shipment = ExpressShipment("delayed", "s10001", 1652712855468)
        shipment.status = "delivered"
        assertEquals(shipment.status, "delivered")
    }
    @Test
    fun testDateTimeExpress() {
        val shipment = ExpressShipment("delayed", "s10001",1652712855468)
        shipment.dateTime = 1652712855468
        assertEquals(shipment.dateTime, 1652712855468)
    }
    @Test
    fun testLocationExpress() {
        val shipment = ExpressShipment("delayed", "s10001", 1652712855468)
        shipment.location = "Nephi, UT"
        assertEquals(shipment.location, "Nephi, UT")
    }

    @Test
    fun testAddNoteOvernight() {
        val shipment = OvernightShipment("shipped", "s10000", 1652712855468)
        assertEquals(shipment.notes.size, 0)
        shipment.addNote("TEST addNote")
        assertEquals(shipment.notes.size, 1)
        assertEquals(shipment.notes[0], "TEST addNote")
    }
    @Test
    fun testAddUpdateOvernight() {
        val shipment = OvernightShipment("delayed", "s10001", 1652712855468)
        assertEquals(shipment.updates.size, 0)
        shipment.addUpdate("TEST addUpdate")
        assertEquals(shipment.updates.size, 1)
        assertEquals(shipment.updates[0], "TEST addUpdate")
    }
    @Test
    fun testStatusOvernight() {
        val shipment = OvernightShipment("delayed", "s10001", 1652712855468)
        shipment.status = "delivered"
        assertEquals(shipment.status, "delivered")
    }
    @Test
    fun testDateTimeOvernight() {
        val shipment = OvernightShipment("delayed", "s10001",1652712855468)
        shipment.dateTime = 1652712855468
        assertEquals(shipment.dateTime, 1652712855468)
    }
    @Test
    fun testLocationOvernight() {
        val shipment = OvernightShipment("delayed", "s10001", 1652712855468)
        shipment.location = "Nephi, UT"
        assertEquals(shipment.location, "Nephi, UT")
    }
}