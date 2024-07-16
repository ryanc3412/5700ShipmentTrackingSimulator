interface ShipmentObserver {
    fun notify(id: String,
               status: String,
               location: String,
               dateTime: Long,
               notes: MutableList<String>,
               updateHistory: MutableList<String>)
}