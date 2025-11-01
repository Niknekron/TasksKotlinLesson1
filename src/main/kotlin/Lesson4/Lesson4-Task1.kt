package org.example.Lesson4

const val TOTAL_TABLES: Int = 13

fun main() {
    val reservationToday: Int = 13
    val reservationTomorrow: Int = 9

    val isAvailableToday: Boolean = reservationToday < TOTAL_TABLES
    val isAvailableTomorrow: Boolean = reservationTomorrow < TOTAL_TABLES

    println("[Table availability for today: $isAvailableToday]\n" +
    "[Table availability for tomorrow: $isAvailableTomorrow]")
}