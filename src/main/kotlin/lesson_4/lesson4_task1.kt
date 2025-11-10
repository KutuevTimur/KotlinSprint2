package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val tablesBookedToday = 13
    val tablesBookedForTomorrow = 9

    val tablesAvailableToday = tablesBookedToday < NUMBER_OF_TABLES
    val tablesAvailableTomorrow = tablesBookedForTomorrow < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $tablesAvailableToday,\nДоступность столиков на завтра: $tablesAvailableTomorrow")
}