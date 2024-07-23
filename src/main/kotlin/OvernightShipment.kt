import com.example.Shipment

class OvernightShipment(
    status: String,
    id: String,
    created: Long
) : Shipment(status, id, created, type = "overnight") {

    override fun isValid(): Boolean {
        return (dateTime - created) < 86400000L
    }
}