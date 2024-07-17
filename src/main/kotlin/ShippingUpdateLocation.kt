package com.example
import ShippingUpdate

class ShippingUpdateLocation(var shipment: Shipment, override var timeStamp: Long, var newLocation: String) : ShippingUpdate {
    override var newStatus = shipment.status
    override var previousStatus = shipment.status
    init {
        shipment.location = newLocation
    }
}