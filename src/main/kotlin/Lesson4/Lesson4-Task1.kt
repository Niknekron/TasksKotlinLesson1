package org.example.Lesson4
const val SUM_TABLES: Int = 13
fun main() {
    val reservationToday: Int = 13
    val reservationTomorrow: Int = 9

    val isAvailableToday: Boolean = reservationToday < SUM_TABLES
    val isAvailableTomorrow: Boolean = reservationTomorrow < SUM_TABLES

    println("[Table availability for today: $isAvailableToday]\n" +
    "[Table availability for today: $isAvailableTomorrow]")
}