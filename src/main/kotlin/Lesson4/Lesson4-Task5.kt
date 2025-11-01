package org.example.Lesson4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_FOOD_BOXES = 50
const val RECCOMENDED_CREW = 70
fun main() {
    val hasDamage = false
    val crewCount: Int = 65
    val numberOfBoxesOfProvision: Int = 60
    val goodWeather = true
    val mainCondition =
        !hasDamage && crewCount >= MIN_CREW && crewCount <= MAX_CREW && numberOfBoxesOfProvision >= MIN_FOOD_BOXES && (goodWeather || !goodWeather)
    val alternativeCondition =
        hasDamage && crewCount == RECCOMENDED_CREW && numberOfBoxesOfProvision > MIN_FOOD_BOXES && goodWeather
    val canSail = mainCondition || alternativeCondition
    println("Can the ship sail? $canSail")
}