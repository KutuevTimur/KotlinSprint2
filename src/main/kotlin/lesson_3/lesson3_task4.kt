package org.example.lesson_3

fun main() {
    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 1

    val firstMoveString = "$moveFrom-$moveTo;$moveNumber"
    println(firstMoveString)

    moveFrom = "D2"
    moveTo = "D3"
    moveNumber = 2

    val secondMoveString = "$moveFrom-$moveTo;$moveNumber"
    println(secondMoveString)
}