package org.example.Lesson2

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_A_DAY = 24

fun main() {
    val startInHours: Int = 9
    val startInMinutes: Int = 39
    val travelMinutes: Int = 457

    val travelToHours = travelMinutes / MINUTES_IN_HOUR
    val remainingMinutes = travelMinutes % MINUTES_IN_HOUR

    val totalMinutes = startInMinutes + remainingMinutes

    val numberOfFullHours = totalMinutes / MINUTES_IN_HOUR
    val extrasMinute = totalMinutes % MINUTES_IN_HOUR

    val totalTimeToTravel = (startInHours + travelToHours + numberOfFullHours) % HOURS_IN_A_DAY

    println("%02d:%02d".format(totalTimeToTravel, extrasMinute))
}