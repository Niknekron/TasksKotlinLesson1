    package org.example.Lesson1

    const val SECOND = 60

fun main() {
    val totalTime: Int = 6480
    val hours = totalTime / (SECOND * SECOND)
    val minutes = (totalTime % (SECOND * SECOND)) / SECOND
    val seconds = totalTime % SECOND
    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}