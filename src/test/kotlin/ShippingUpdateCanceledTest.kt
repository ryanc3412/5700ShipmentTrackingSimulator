import com.example.Shipment
import com.example.ShippingUpdateCanceled
import java.time.Instant
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ShippingUpdateCanceledTest {
    @Test
    fun testStatusChangeToCanceled() {
        val shipment = StandardShipment("delivered", "12345", 1652712855468)
        val timeStamp = System.currentTimeMillis()
        val shippingUpdateCanceled = ShippingUpdateCanceled(shipment, timeStamp)
        assertEquals("canceled", shipment.status)
    }
}