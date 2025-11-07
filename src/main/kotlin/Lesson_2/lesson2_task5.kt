package org.example.Lesson_2

import kotlin.math.pow

fun main() {
    val initialDeposit = 70_000.0
    val rate = 16.7

    val interestRate = rate / 100
    val years = 20

    // A = deposit × (1 + percent)^years - формула сложных процентов
    val finalAmount = initialDeposit * (1 + interestRate).pow(years)

    println("%.3f".format(finalAmount))
}