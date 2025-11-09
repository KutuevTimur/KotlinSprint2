package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val tablesBookedToday = 13
    val tablesBookedForTomorrow = 9

    val tablesAvailableToday = (NUMBER_OF_TABLES - tablesBookedToday) > 0
    val tablesAvailableTomorrow = (NUMBER_OF_TABLES - tablesBookedForTomorrow) > 0

    println("Доступность столиков на сегодня: $tablesAvailableToday, \nДоступность столиков на завтра: $tablesAvailableTomorrow")
}