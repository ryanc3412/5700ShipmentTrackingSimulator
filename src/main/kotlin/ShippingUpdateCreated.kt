class ShippingUpdateCreated(var id: String, override var timeStamp: Long) : ShippingUpdate {
    override var newStatus = "created"
    override var previousStatus = ""
    var toShipment = Shipment(newStatus, id)
        private set
}