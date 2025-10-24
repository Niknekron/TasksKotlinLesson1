package org.example.Lesson2

fun main() {
    val startInHours: Int = 9
    val startInMinutes: Int = 39
    val travelMinutes: Int = 457

    val travelToHours = travelMinutes / 60
    val remainingMinutes = travelMinutes % 60

    val totalMinutes = startInMinutes + remainingMinutes

    val numberOfFullHours = totalMinutes / 60
    val extrasMinute = totalMinutes % 60

    val totalTimeToTravel = (startInHours + travelToHours + numberOfFullHours) % 24

    println(String.format("%02d:%02d", totalTimeToTravel, extrasMinute))
}