package org.example.Lesson_2

const val BUFF_PERCENT = 20
const val BUFF_MULTIPLIER = BUFF_PERCENT / 100.0

fun main() {

    val crystalWithoutBuff = 7
    val ironWithoutBuff = 11

    val crystalBonus = (crystalWithoutBuff * BUFF_MULTIPLIER).toInt()
    val ironBonus = (ironWithoutBuff * BUFF_MULTIPLIER).toInt()

    println("Кристаллическая руда: $crystalBonus")
    println("Железная руда: $ironBonus")
}