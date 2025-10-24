package org.example.Lesson2

import kotlin.math.abs
import kotlin.math.pow

fun main() {
    val initialDeposit: Double = 70000.0
    val annualInterestRate: Double = 16.7
    val years: Int = 20

    val interestRate = annualInterestRate / 100
    val finalEmount = (initialDeposit * (1 + interestRate).pow(years))

    println("Total: %.3f".format(finalEmount))
}