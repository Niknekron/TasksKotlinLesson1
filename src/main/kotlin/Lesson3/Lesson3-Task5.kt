package org.example.Lesson3

fun main() {
    val availavleInformation: String = "D2-D4;0"
    val parts = availavleInformation.split('-',';')

    val from = parts[0]
    val to = parts[1]
    val steps = parts[2]

    println(from)
    println(to)
    println(steps)
}