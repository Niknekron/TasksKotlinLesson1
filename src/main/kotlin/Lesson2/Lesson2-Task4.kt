package org.example.Lesson2

const val BONUS_PERCENT = 20
const val PERCENT_VALUE = 100

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11

    val buffCrystalOre = (crystalOre * BONUS_PERCENT / PERCENT_VALUE).toInt()
    val buffIronore = (ironOre * BONUS_PERCENT / PERCENT_VALUE).toInt()

    println("Crystal Ore: $buffCrystalOre")
    println("Iron Ore: $buffIronore")
}