import kotlinx.coroutines.delay
import androidx.compose.runtime.mutableStateListOf

class Shipment(status: String, id: String): ShipmentSubject {
    var status: String = ""
        set(value) {
            field = value
            notifyObservers()
        }
    var id: String = ""
        private set(value) {
            field = value
            notifyObservers()
        }
    var notes: MutableList<String> = mutableStateListOf()
        private set(value) {
            field = value
            notifyObservers()
        }
    var updates: MutableList<String> = mutableStateListOf()
        private set(value) {
            field = value
            notifyObservers()
        }
    var dateTime: Long = 0L
        set(value) {
            field = value
            notifyObservers()
        }
    var location: String = "Unknown"
        set(value) {
            field = value
            notifyObservers()
        }

    private val subscribers = mutableListOf<ShipmentObserver>()

    init {
        this.status = status
        this.id = id
    }

    fun addNote(note: String) {
        this.notes.add(note)
    }

    fun addUpdate(update: String) {
        this.updates.add(update)
    }

    override fun subscribe(observer: ShipmentObserver) {
        subscribers.add(observer)
    }

    override fun unsubscribe(observer: ShipmentObserver) {
        subscribers.remove(observer)
    }

    override fun notifyObservers() {
        subscribers.forEach { it.notify(id, status, location, dateTime, notes, updates)}
    }


}