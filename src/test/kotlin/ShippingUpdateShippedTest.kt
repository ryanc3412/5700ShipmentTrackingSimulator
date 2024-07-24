import com.example.Shipment
import com.example.ShippingUpdateDelayed
import com.example.ShippingUpdateShipped
import junit.framework.TestCase.assertEquals
import kotlin.test.Test

class ShippingUpdateShippedTest {
private val id = "12345"
    private val initialStatus = "processing"
    private val initialDateTime: Long = System.currentTimeMillis()
    private val timeStamp: Long = System.currentTimeMillis() + 1000
    private val expectedArrival: Long = System.currentTimeMillis() + 3600000

    @Test
    fun testNewStatus() {
        val shipment = StandardShipment(id, initialStatus, initialDateTime)
        val shippingUpdateShipped = ShippingUpdateShipped(shipment, timeStamp, expectedArrival)
        assertEquals("shipped", shippingUpdateShipped.newStatus)
    }

    @Test
    fun testTimeStamp() {
        val shipment = StandardShipment(id, initialStatus, initialDateTime)
        val shippingUpdateShipped = ShippingUpdateShipped(shipment, timeStamp, expectedArrival)
        assertEquals(timeStamp, shippingUpdateShipped.timeStamp)
    }

    @Test
    fun testExpectedArrival() {
        val shipment = StandardShipment(id, initialStatus, initialDateTime)
        val shippingUpdateShipped = ShippingUpdateShipped(shipment, timeStamp, expectedArrival)
        assertEquals(expectedArrival, shippingUpdateShipped.expectedArrival)
    }

    @Test
    fun testShipmentStatusUpdate() {
        val shipment = StandardShipment(id, initialStatus, initialDateTime)
        val shippingUpdateShipped = ShippingUpdateShipped(shipment, timeStamp, expectedArrival)
        assertEquals("shipped", shipment.status)
    }

    @Test
    fun testShipmentDateTimeUpdate() {
        val shipment = StandardShipment(id, initialStatus, initialDateTime)
        val shippingUpdateShipped = ShippingUpdateShipped(shipment, timeStamp, expectedArrival)
        assertEquals(expectedArrival, shipment.dateTime)
    }
}