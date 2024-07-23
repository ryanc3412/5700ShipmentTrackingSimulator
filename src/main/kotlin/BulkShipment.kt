import com.example.Shipment

class BulkShipment(
    status: String,
    id: String,
    created: Long
) : Shipment(status, id, created, type = "bulk") {

    override fun isValid(): Boolean {
        return (dateTime - created) >= 259200000L
    }
}