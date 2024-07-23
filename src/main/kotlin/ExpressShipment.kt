import com.example.Shipment

class ExpressShipment(status: String,
                      id: String,
                      created: Long
) : Shipment(status, id, created, type = "express") {

    override fun isValid(): Boolean {
        val threeDaysInMillis: Long = 3 * 24 * 60 * 60 * 1000L
        return (dateTime - created) < threeDaysInMillis
    }
}