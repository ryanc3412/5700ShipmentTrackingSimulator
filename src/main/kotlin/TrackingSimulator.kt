import java.io.File

class TrackingSimulator {
    private var shipments = mutableListOf<Shipment>()

    fun findShipment(id: String) : Shipment? {
        shipments.forEach {
            if(it.id == id) {
                return it
            }
        }
        return null
    }

    fun addShipment(shipment: Shipment) {
        shipments.add(shipment)
    }

    suspend fun runSimulation() {
        val allLines = mutableListOf<String>()

        File ("./src/main/resources/test.txt").reader().useLines{
            lines ->lines.forEach {
                allLines.add (it)
            }
        }

        allLines.forEach {
            val shipmentTake = it.split(",")
        }
    }
}