package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val win1 = Random.nextInt(0, 43)
    val win2 = Random.nextInt(0, 43)
    val win3 = Random.nextInt(0, 43)

    println("Угадайте три числа от 0 до 42")

    print("Введите первое число: ")
    val num1 = readln().toInt()

    print("Введите второе число: ")
    val num2 = readln().toInt()

    print("Введите третье число: ")
    val num3 = readln().toInt()

    var correctCount = 0

    if (num1 == win1 || num1 == win2 || num1 == win3) correctCount++
    if (num2 == win1 || num2 == win2 || num2 == win3) correctCount++
    if (num3 == win1 || num3 == win2 || num3 == win3) correctCount++

    when (correctCount) {
        3 -> {
            println("Ура!!! Вы угадали все три числа и выиграли ДЖЕКПОТ!")
        }
        2 -> {
            println("Отлично! Вы угадали два числа и получаете крупный приз!")
        }
        1 -> {
            println("Кайф! Вы угадали одно число и получаете утешительный приз!")
        }
        0 -> {
            println("К сожалению, вы не угадали ни одного числа.")
        }
    }

    println("\nВыигрышные числа: $win1, $win2, $win3")
}