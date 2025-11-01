package org.example.Lesson4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    val weight1: Int = 20
    val volume1: Int = 80
    val weight2: Int = 50
    val volume2: Int = 100

    println(
        "A load weighing $weight1 kg and having a volume of $volume1 l corresponds to the category 'Average': " +
                (weight1 > MIN_WEIGHT && weight1 <= MAX_WEIGHT && volume1 < MAX_VOLUME)
    )
    println(
        "A load weighing $weight2 kg and having a volume of $volume2 l corresponds to the category 'Average':" +
                (weight2 > MIN_WEIGHT && weight2 <= MAX_WEIGHT && volume2 < MAX_VOLUME)
    )
}