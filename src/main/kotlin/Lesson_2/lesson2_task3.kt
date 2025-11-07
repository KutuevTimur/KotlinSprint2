package org.example.Lesson_2

fun main() {

    val departureHour: Int = 9
    val departureMinute: Int = 39
    val travelTimeMinutes: Int = 457

    val totalMinutes: Int = departureHour * 60 + departureMinute + travelTimeMinutes
    val arrivalHour = (totalMinutes / 60 ) % 24
    val arrivalMinute = totalMinutes % 60

    println("${"%02d".format(arrivalHour)}:${"%02d".format(arrivalMinute)}")

}