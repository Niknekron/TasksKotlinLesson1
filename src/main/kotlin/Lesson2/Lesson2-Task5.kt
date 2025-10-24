package org.example.Lesson2

import kotlin.math.abs
import kotlin.math.pow

fun main() {
    val P: Double = 70000.0
    val r: Double = 0.167
    val n: Double = 1.0
    val t: Double = 20.0

    val A = (P * (1 + r / n).pow(n*t))

    println("Total: %.3f".format(A))

    val expectedResult: Double = 1536438.428
    val comparisonOfResults: Boolean = abs(expectedResult - A) < 0.001

    println(comparisonOfResults)
}