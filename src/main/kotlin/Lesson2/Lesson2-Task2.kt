package org.example.Lesson2

fun main() {
    val numberOfPremanentEmployess: Short = 50
    val salaryOfPermanentEmployes: Int = 30000
    val expensesForPermanentEmployees = numberOfPremanentEmployess * salaryOfPermanentEmployes

    println(expensesForPermanentEmployees)

    val numberOfTrainees: Short = 30
    val salaryOfTrainees: Int = 20000
    val expensesForTrainees = numberOfTrainees * salaryOfTrainees
    val generalExpenses = expensesForPermanentEmployees + expensesForTrainees

    println(generalExpenses)

    val totalNumbersOfEmployees = numberOfPremanentEmployess + numberOfTrainees
    val averageSalary = generalExpenses / totalNumbersOfEmployees

    println(averageSalary)

}