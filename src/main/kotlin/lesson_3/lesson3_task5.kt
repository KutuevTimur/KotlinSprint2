package org.example.lesson_3

fun main() {
    val moveString = "D2-D4;0"
    val partsOfMoveString = moveString.split("-", ";")
    val moveFrom = partsOfMoveString[0]
    val moveTo = partsOfMoveString[1]
    val moveNumber = partsOfMoveString[2]

    println("Откуда: $moveFrom")
    println("Куда: $moveTo")
    println("Номер кода: $moveNumber")
}