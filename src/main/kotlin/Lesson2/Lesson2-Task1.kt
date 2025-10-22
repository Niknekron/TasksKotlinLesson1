package org.example.Lesson2

fun main() {
    val student1: Double = 3.00
    val student2: Double = 4.00
    val student3: Double = 3.00
    val student4: Double = 5.00
    val numberOfStudents: Int = 4
    val overallRating = (student1 + student2 + student3 + student4) / numberOfStudents

    println(overallRating)

    /*Есть еще такой вариант вывода:
    println(String.format("%.2f", overallRating))*/
}