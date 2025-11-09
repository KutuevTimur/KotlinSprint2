package org.example.lesson_4

const val SUNNY_WEATHER = true
const val OUTDOOR_TENT = true
const val REQUIRED_HUMIDITY = 20
const val UNACCEPTABLE_SEASON = "зима"

fun main() {
    val isSunnyToday = true
    val isTentOpenNow = true
    val currentHumidity = 20
    val currentSeason = "зима"

    val isAcceptable = isSunnyToday == SUNNY_WEATHER &&
            isTentOpenNow == OUTDOOR_TENT &&
            currentHumidity == REQUIRED_HUMIDITY &&
            currentSeason != UNACCEPTABLE_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $isAcceptable")
}