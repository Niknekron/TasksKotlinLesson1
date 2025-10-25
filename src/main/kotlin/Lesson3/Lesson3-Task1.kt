package org.example.Lesson3

fun main() {
    val greetings: String = "Hello our dear client"
    val name: String = "Aleks"
    val morningGreetings: String = "$name, $greetings! It's time before lunch now"
    val eveningGreeting: String = "$name, $greetings! It's now afternoon"

    println(morningGreetings)
    println(eveningGreeting)
}