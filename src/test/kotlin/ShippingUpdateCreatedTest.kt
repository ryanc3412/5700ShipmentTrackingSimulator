import com.example.ShippingUpdateCreated
import kotlin.test.Test
import kotlin.test.assertEquals

class ShippingUpdateCreatedTest {
    private lateinit var shippingUpdateCreated: ShippingUpdateCreated
    private val id = "12345"
    private val timeStamp: Long = System.currentTimeMillis()
    private val type = "Standard"

    @Test
    fun testNewStatus() {
        val shippingUpdateCreated = ShippingUpdateCreated(id, timeStamp, type)
        assertEquals("created", shippingUpdateCreated.newStatus)
    }

    @Test
    fun testPreviousStatus() {
        val shippingUpdateCreated = ShippingUpdateCreated(id, timeStamp, type)
        assertEquals("", shippingUpdateCreated.previousStatus)
    }

    @Test
    fun testId() {
        val shippingUpdateCreated = ShippingUpdateCreated(id, timeStamp, type)
        assertEquals(id, shippingUpdateCreated.id)
    }

    @Test
    fun testTimeStamp() {
        val shippingUpdateCreated = ShippingUpdateCreated(id, timeStamp, type)
        assertEquals(timeStamp, shippingUpdateCreated.timeStamp)
    }
}