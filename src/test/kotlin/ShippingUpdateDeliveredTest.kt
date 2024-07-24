import com.example.Shipment
import com.example.ShippingUpdateDelivered
import kotlin.test.Test
import kotlin.test.assertEquals

class ShippingUpdateDeliveredTest {
    @Test
    fun testStatusChangeToDelivered() {
        val shipment = StandardShipment("In Transit", "12345", 1652712855468)
        val timeStamp = System.currentTimeMillis()
        val shippingUpdateDelivered = ShippingUpdateDelivered(shipment, timeStamp)
        assertEquals("delivered", shipment.status)
    }
}