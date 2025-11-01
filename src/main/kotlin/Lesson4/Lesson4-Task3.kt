package org.example.Lesson4

const val REQUIRED_HUMIDITY_PERCENT = 20
const val FORBIDDEN_SEASON = "winter"

fun main() {
    val weatherToDay = true
    val openAwningToday = true
    val airHumidityTodayPercent = 20
    val timeOfYearNow = "winter"
    val isFavorable = weatherToDay && openAwningToday && airHumidityTodayPercent == REQUIRED_HUMIDITY_PERCENT && timeOfYearNow != FORBIDDEN_SEASON
    println("Are conditions now favorable for growing legumes?: $isFavorable"
    )
}