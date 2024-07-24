package com.example

import StandardShipment
import androidx.compose.runtime.mutableStateListOf
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TrackerViewHelperTest {
    private lateinit var shipment: Shipment
    private lateinit var trackerViewHelper: TrackerViewHelper
    private val id = "12345"
    private val status = "shipped"
    private val type = "Standard"
    private val dateTime: Long = System.currentTimeMillis()
    private val location = "New York"
    private val notes = mutableStateListOf("Initial note")
    private val updates = mutableStateListOf("Initial update")

    @BeforeTest
    fun setUp() {
        shipment = StandardShipment(id, status, dateTime).apply {
            this.location = location
            this.notes.addAll(notes)
            this.updates.addAll(updates)
        }
        trackerViewHelper = TrackerViewHelper(shipment)
    }

    @Test
    fun testNotify() {
        val newStatus = "in transit"
        val newLocation = "Los Angeles"
        val newDateTime: Long = dateTime + 3600000
        val newNotes = mutableStateListOf("Updated note")
        val newUpdates = mutableStateListOf("Updated update")
        val newType = "Express"

        trackerViewHelper.notify(id, newStatus, newLocation, newDateTime, newNotes, newUpdates, newType)

        assertEquals(id, trackerViewHelper.id)
        assertEquals(newStatus, trackerViewHelper.status)
        assertEquals(newType, trackerViewHelper.type)
        assertEquals(newDateTime, trackerViewHelper.dateTime)
        assertEquals(newLocation, trackerViewHelper.location)
        assertEquals(newNotes, trackerViewHelper.notes)
        assertEquals(newUpdates, trackerViewHelper.update)
    }
}