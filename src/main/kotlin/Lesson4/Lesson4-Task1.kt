package org.example.Lesson4

fun main() {
    val sumTables: Int = 13
    val reservationToday: Int = 13
    val reservationTomorrow: Int = 9

    val isAvailavleToday:Boolean = sumTables > reservationToday
    val isAvailableTomorrow:Boolean = sumTables > reservationTomorrow

    println("Table availability for today: $isAvailavleToday")
    println("Table availability for today: $isAvailableTomorrow")
}