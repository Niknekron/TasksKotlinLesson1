package org.example.Lesson4

fun main() {
    val day = 5
    val isArmsDay = day % 2 != 0
    val isAbdominalDay = day % 2 != 0
    val isLegsDay = day % 2 == 0
    val isBackDay = day % 2 == 0

    println(
        "Hand exercises: $isArmsDay\n" +
                "Leg exercises: $isLegsDay\n" +
                "Back exercises: $isBackDay\n" +
                "Abdominal exercises: $isAbdominalDay"
    )
}