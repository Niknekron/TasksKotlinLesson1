package org.example.Lesson2

const val POWER_OF_BUFF = 20

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11

    val buffCrystalOre = (crystalOre * POWER_OF_BUFF / 100).toInt()
    val buffIronore = (ironOre * POWER_OF_BUFF / 100).toInt()

    println("Crystal Ore: $buffCrystalOre")
    println("Iron Ore: $buffIronore")
}