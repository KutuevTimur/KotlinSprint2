package org.example.lesson_1

fun main() {
    val totalSeconds: Int = 6480

    val hours: Int = totalSeconds / 3600
    val remainingSecondsAfterHours: Int = totalSeconds % 3600

    val minutes: Int = remainingSecondsAfterHours / 60
    val seconds: Int = remainingSecondsAfterHours % 60

    val formattedHours = String.format("%02d", hours)
    val formattedMinutes = String.format("%02d", minutes)
    val formattedSeconds = String.format("%02d", seconds)

    println("[$formattedHours:$formattedMinutes:$formattedSeconds]")

}