import com.example.Shipment
import com.example.ShippingUpdateLocation
import kotlin.test.Test
import kotlin.test.assertEquals

class ShippingUpdateLocationTest {
    @Test
    fun testLocationChange() {
        val shipment = StandardShipment("In Transit", "12345", 1652712855468)
        val timeStamp = System.currentTimeMillis()
        val newLocation = "New York"
        val shippingUpdateLocation = ShippingUpdateLocation(shipment, timeStamp, newLocation)

        assertEquals(newLocation, shipment.location)
    }
}