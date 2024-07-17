import com.example.Shipment
import com.example.ShippingUpdateLost
import kotlin.test.Test
import kotlin.test.assertEquals

class ShippingUpdateLostTest {
    @Test
    fun testStatusChangeToLost() {
        val shipment = Shipment("In Transit", "12345")
        val timeStamp = System.currentTimeMillis()
        val shippingUpdateLost = ShippingUpdateLost(shipment, timeStamp)
        assertEquals("lost", shipment.status)
    }
}