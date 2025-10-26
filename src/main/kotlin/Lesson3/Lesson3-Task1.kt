package org.example.Lesson3

fun main() {
    val greetings: String = "Hello our dear client"
    val name: String = "Aleks"
    var finalGreetings: String = "$name, $greetings! It's time before lunch now"

    println(finalGreetings)

    finalGreetings = "$name, $greetings! It's now afternoon"
    println(finalGreetings)
}