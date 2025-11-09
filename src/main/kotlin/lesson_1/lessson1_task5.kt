package org.example.lesson_1

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    // Константы


    val totalSeconds = 6480

    val hours = totalSeconds / SECONDS_IN_HOUR
    val remainingSecondsAfterHours = totalSeconds % SECONDS_IN_HOUR

    val minutes = remainingSecondsAfterHours / SECONDS_IN_MINUTE
    val seconds = remainingSecondsAfterHours % SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}