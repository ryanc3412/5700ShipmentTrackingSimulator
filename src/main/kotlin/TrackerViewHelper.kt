package com.example
import ShipmentObserver
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.Shipment

class TrackerViewHelper(var shipment: Shipment): ShipmentObserver {
    var id by mutableStateOf("")
        private set
    var status by mutableStateOf("")
        private set
    var type by mutableStateOf("")
        private set;
    var notes: MutableList<String> = mutableStateListOf()
        private set
    var update : MutableList<String> = mutableStateListOf()
        private set
    var dateTime by mutableStateOf(0L)
        private set
    var location by mutableStateOf("")
        private set

    init {
        shipment.subscribe(this)
        id = shipment.id
        status = shipment.status
        notes = shipment.notes
        update = shipment.updates
        dateTime = shipment.dateTime
        location = shipment.location
        type = shipment.type
    }

    override fun notify(
        id: String,
        status: String,
        location: String,
        dateTime: Long,
        notes: MutableList<String>,
        updateHistory: MutableList<String>,
        type: String
    ) {
        this.id = id
        this.status = status
        this.notes = notes
        this.update = updateHistory
        this.dateTime = dateTime
        this.location = location
        this.type = type
    }
}