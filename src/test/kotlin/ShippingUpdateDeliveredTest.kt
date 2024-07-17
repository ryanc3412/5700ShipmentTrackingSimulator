import com.example.Shipment
import com.example.ShippingUpdateDelivered
import kotlin.test.Test
import kotlin.test.assertEquals

class ShippingUpdateDeliveredTest {
    @Test
    fun testStatusChangeToDelivered() {
        val shipment = Shipment("In Transit", "12345")
        val timeStamp = System.currentTimeMillis()
        val shippingUpdateDelivered = ShippingUpdateDelivered(shipment, timeStamp)
        assertEquals("delivered", shipment.status)
    }
}