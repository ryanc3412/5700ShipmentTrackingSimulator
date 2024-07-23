package com.example
import Factory
import ShippingUpdate

class ShippingUpdateCreated(var id: String, override var timeStamp: Long, type: String) : ShippingUpdate {
    override var newStatus = "created"
    override var previousStatus = ""
    var toShipment = Factory.shipmentCreation("created", id, timeStamp, type)
        private set
}