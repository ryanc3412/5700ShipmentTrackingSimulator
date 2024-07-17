import com.example.Shipment
import com.example.ShippingUpdateDelayed
import junit.framework.TestCase.assertEquals
import kotlin.test.Test

class ShippingUpdateShippedTest {
    @Test
    fun testStatusChangeToDelayed() {
        val shipment = Shipment("In Transit", "12345")
        val timeStamp = System.currentTimeMillis()
        val newTime = System.currentTimeMillis() + 3600000 // 1 hour later
        val shippingUpdateDelayed = ShippingUpdateDelayed(shipment, timeStamp, newTime)

        assertEquals("delayed", shipment.status)
    }
}