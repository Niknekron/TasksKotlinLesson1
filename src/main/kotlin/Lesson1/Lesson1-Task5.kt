    package org.example.Lesson1

fun main() {
    val totalTime: Int = 6480
    val hours = totalTime / 3600
    val minutes = (totalTime % 3600) / 60
    val seconds = totalTime % 60
    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}