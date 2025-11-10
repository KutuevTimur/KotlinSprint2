package org.example.lesson_5

fun main() {
    val range = 1..5
    val firstNumber = range.random()
    val secondNumber = range.random()
    val correctAnswer = firstNumber + secondNumber

    println("Решите пример: $firstNumber + $secondNumber =")
    print("Введите ваш ответ: ")

    val userAnswer = readln().toInt()

    if (userAnswer == correctAnswer) {
        println("Верно! Добро пожаловать")
    } else {
        println("Неверно! Доступ запрещен")
    }
}