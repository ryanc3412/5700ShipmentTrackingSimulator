import com.example.Shipment

class StandardShipment(
    status: String,
    id: String,
    created: Long
) : Shipment(status, id, created, type = "standard") {

    override fun isValid(): Boolean {
        return true
    }
}