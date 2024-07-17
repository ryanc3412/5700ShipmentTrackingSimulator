package com.example
import ShippingUpdate

class ShippingUpdateNoteAdded(var shipment: Shipment, override var timeStamp: Long, var note: String) : ShippingUpdate{
    override var newStatus = shipment.status
    override var previousStatus = shipment.status
    init{
        shipment.addNote(note)
    }
}