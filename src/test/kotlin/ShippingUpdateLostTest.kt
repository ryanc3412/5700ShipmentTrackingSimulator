import com.example.Shipment
import com.example.ShippingUpdateLost
import kotlin.test.Test
import kotlin.test.assertEquals

class ShippingUpdateLostTest {
    @Test
    fun testStatusChangeToLost() {
        val shipment = StandardShipment("In Transit", "12345", 1652712855468)
        val timeStamp = System.currentTimeMillis()
        val shippingUpdateLost = ShippingUpdateLost(shipment, timeStamp)
        assertEquals("lost", shipment.status)
    }
}