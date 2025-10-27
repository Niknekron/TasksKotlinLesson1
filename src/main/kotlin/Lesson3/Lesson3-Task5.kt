package org.example.Lesson3

fun main() {
    val availavleInformation: String = "D2-D4;0"
    val parts = availavleInformation.split(";")

    val fromTO = parts[0].split('-')
    val from = fromTO[0]
    val to = fromTO[1]
    val steps = parts[1].toInt()

    println(availavleInformation)
    println(from)
    println(to)
    println(steps)
}