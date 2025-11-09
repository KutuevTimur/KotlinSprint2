package org.example.lesson_4

import kotlin.io.path.fileVisitor

fun main() {
    val trainingDay = 5

    val isArmsDay = trainingDay % 2 == 1
    val isLegDay = !isArmsDay
    val isBackDay = !isArmsDay
    val isAbsDay = isArmsDay

    println(
        "Упражнения для рук:    $isArmsDay\n" +
                "Упражнения для ног:    $isLegDay\n" +
                "Упражнения для спины:  $isBackDay\n" +
                "Упражнения для пресса: $isAbsDay"
    )
}