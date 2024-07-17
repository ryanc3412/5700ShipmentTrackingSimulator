package com.example
import java.time.Instant
import ShippingUpdate

class ShippingUpdateDelayed(var shipment: Shipment, override var timeStamp: Long, var newTime: Long) : ShippingUpdate {
    override var newStatus = "delayed"
    override var previousStatus = shipment.status
    init {
        shipment.status = newStatus
        shipment.dateTime = newTime
        shipment.addUpdate("Shipment went from $previousStatus to $newStatus at ${Instant.ofEpochMilli(timeStamp)}")
    }
}