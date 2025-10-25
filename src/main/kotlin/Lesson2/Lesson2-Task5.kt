package org.example.Lesson2
import kotlin.math.pow

const val percentValue = 100

fun main() {
    val initialDeposit: Double = 70000.0
    val annualInterestRate: Double = 16.7
    val years: Int = 20

    val interestRate = annualInterestRate / percentValue
    val finalAmount = initialDeposit * (1 + interestRate).pow(years)
    println("Total: %.3f".format(finalAmount))
}