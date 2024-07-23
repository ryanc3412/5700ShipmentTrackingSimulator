package com.example
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.coroutines.delay
import java.io.File

class TrackingServer {
    companion object TrackingSimulatorObject {

        private var shipments = mutableMapOf<String, Shipment>()

        suspend fun runServer() {
            embeddedServer(Netty, port = 8000) {
                routing {
                    get("/") {
                        val file = File("webpage.html")
                        val contents = file.readText()
                        call.respondText(contents, ContentType.Text.Html)

                        var pl = ""

                        if (call.parameters["say"] != null) {
                            call.parameters["say"]?.let { it1 -> pl = it1 }

                            println("> " + pl)
                            val item = pl.split(",")
                            when (item[0]) {
                                "created" -> {
                                    addShipment(ShippingUpdateCreated(item[1], item[2].toLong(), item[3]).toShipment)
                                }
                                "shipped" -> {
                                    findShipment(item[1])?.let { it1 ->
                                        ShippingUpdateShipped(
                                            it1,
                                            item[2].toLong(),
                                            item[3].toLong()
                                        )
                                    }
                                }
                                "location" -> {
                                    findShipment(item[1])?.let { it1 ->
                                        ShippingUpdateLocation(
                                            it1,
                                            item[2].toLong(),
                                            item[3]
                                        )
                                    }
                                }
                                "delivered" -> {
                                    findShipment(item[1])?.let { it1 -> ShippingUpdateDelivered(it1, item[2].toLong()) }
                                }
                                "delayed" -> {
                                    findShipment(item[1])?.let { it1 ->
                                        ShippingUpdateDelayed(
                                            it1,
                                            item[2].toLong(),
                                            item[3].toLong()
                                        )
                                    }
                                }
                                "lost" -> {
                                    findShipment(item[1])?.let { it1 -> ShippingUpdateLost(it1, item[2].toLong()) }
                                }
                                "canceled" -> {
                                    findShipment(item[1])?.let { it1 -> ShippingUpdateCanceled(it1, item[2].toLong()) }
                                }
                                "noteadded" -> {
                                    findShipment(item[1])?.let { it1 ->
                                        ShippingUpdateNoteAdded(
                                            it1,
                                            item[2].toLong(),
                                            item[3]
                                        )
                                    }
                                }
                                else -> {
                                    println("Strategy not found")
                                }
                            }
                            if (findShipment(item[1]) == null) {
                                println("> Added")
                            } else {
                                println("> Found")
                            }
                        }
                    }
                }
            }.start(wait = true)
            delay(1000)
        }

        fun findShipment(id: String) : Shipment? {
            return shipments.get(id)
        }

        fun addShipment(shipment: Shipment) {
            shipments.put(shipment.id, shipment)
        }
    }
}