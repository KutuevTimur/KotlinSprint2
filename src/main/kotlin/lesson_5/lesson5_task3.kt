package org.example.lesson_5

fun main() {
    val winNumber1 = 5
    val winNumber2 = 28

    println("Угадайте 2 числа от 0 до 42 для выигрыша в лотерее!")
    print("Введите первое число: ")
    val userNumber1 = readln().toInt()
    print("Введите второе число: ")
    val userNumber2 = readln().toInt()

    val guessedFirst = userNumber1 == winNumber1 || userNumber1 == winNumber2
    val guessedSecond = userNumber2 == winNumber1 || userNumber2 == winNumber2
    val guessedBoth = guessedFirst && guessedSecond

    when {
        guessedBoth -> println("Поздравляем! Вы выиграли главный приз!")
        guessedFirst || guessedSecond -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }

    println("Для победы нужно было угадать числа: $winNumber1 и $winNumber2")
}