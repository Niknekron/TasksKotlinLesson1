package org.example.Lesson3

fun main() {
    val firstName: String = "Tatyana"
    var secondName: String = "Andreewa"
    val surname: String = "Sergeevna"
    var age: Int = 20
    println("Full name: $secondName $firstName $surname. Full age: $age")

    secondName = "Sidorova"
    age = 22
    println("Full name: $secondName $firstName $surname. Full age: $age")
}