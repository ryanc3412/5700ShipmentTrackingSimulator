import com.example.Shipment
import com.example.ShippingUpdateLocation
import kotlin.test.Test
import kotlin.test.assertEquals

class ShippingUpdateLocationTest {
    @Test
    fun testLocationChange() {
        val shipment = Shipment("In Transit", "12345")
        val timeStamp = System.currentTimeMillis()
        val newLocation = "New York"
        val shippingUpdateLocation = ShippingUpdateLocation(shipment, timeStamp, newLocation)

        assertEquals(newLocation, shipment.location)
    }
}