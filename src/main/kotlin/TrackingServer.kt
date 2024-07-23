package com.example
import kotlinx.coroutines.delay
import java.io.File

class TrackingServer {
    companion object TrackingSimulatorObject {

        private var shipments = mutableMapOf<String, Shipment>()

        suspend fun runServer() {
            embeddedServer(Netty, 3000) {

            }
        }

//        fun findShipment(id: String) : Shipment? {
//            shipments.forEach {
//                if(it.id == id) {
//                    return it
//                }
//            }
//            return null
//        }
//
//        fun addShipment(shipment: Shipment) {
//            shipments.add(shipment)
//        }
//
//        private fun checkStrategy(shipmentPiece: List<String>) {
//            when (shipmentPiece[0]) {
//                "created" -> {addShipment(ShippingUpdateCreated(shipmentPiece[1], shipmentPiece[2].toLong()).toShipment)}
//                "shipped" -> {findShipment(shipmentPiece[1])?.let { it1 -> ShippingUpdateShipped(it1, shipmentPiece[2].toLong(), shipmentPiece[3].toLong())}}
//                "location" -> {findShipment(shipmentPiece[1])?.let { it1 -> ShippingUpdateLocation(it1, shipmentPiece[2].toLong(), shipmentPiece[3])}}
//                "delivered" -> {findShipment(shipmentPiece[1])?.let { it1 -> ShippingUpdateDelivered(it1, shipmentPiece[2].toLong())}}
//                "delayed" -> {findShipment(shipmentPiece[1])?.let { it1 -> ShippingUpdateDelayed(it1, shipmentPiece[2].toLong(), shipmentPiece[3].toLong())}}
//                "lost" -> {findShipment(shipmentPiece[1])?.let { it1 -> ShippingUpdateLost(it1, shipmentPiece[2].toLong())}}
//                "canceled" -> {findShipment(shipmentPiece[1])?.let { it1 -> ShippingUpdateCanceled(it1, shipmentPiece[2].toLong())}}
//                "noteadded" -> {findShipment(shipmentPiece[1])?.let { it1 -> ShippingUpdateNoteAdded(it1, shipmentPiece[2].toLong(), shipmentPiece[3])}}
//                else -> {
//                    println("Unknown strategy entered")
//                }
//            }
//        }
//
//        suspend fun runSimulation() {
//            val filePath = "./src/main/resources/test.txt"
//            val allLines = File(filePath).readLines()
//            allLines.forEach { line ->
//                val shipmentPiece = line.split(",")
//                checkStrategy(shipmentPiece)
//                delay(1000)
//            }
//        }
    }
}