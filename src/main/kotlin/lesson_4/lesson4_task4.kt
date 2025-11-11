package org.example.lesson_4

fun main() {
    val trainingDay = 5
    val isOddDay = trainingDay % 2 != 0

    println(
        "Упражнения для рук:    $isOddDay\n" +
                "Упражнения для ног:    ${!isOddDay}\n" +
                "Упражнения для спины:  ${!isOddDay}\n" +
                "Упражнения для пресса: $isOddDay"
    )
}