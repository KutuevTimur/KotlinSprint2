package org.example.lesson_5
// Константа для расчета расхода (100 км)
const val BASE_DISTANCE = 100.0
fun main() {
    print("Введите расстояние поездки (км): ")
    val distance = readln().toDouble()

    print("Введите расход топлива на 100 км (л): ")
    val fuelConsumption = readln().toDouble()

    print("Введите текущую цену за литр топлива (руб): ")
    val pricePerLiter = readln().toDouble()

    val fuelNeeded = (distance * fuelConsumption) / BASE_DISTANCE
    val totalCost = fuelNeeded * pricePerLiter

    println()
    println("Результаты расчета:")
    println("Необходимое количество топлива: ${"%.2f".format(fuelNeeded)} л")
    println("Общая стоимость поездки: ${"%.2f".format(totalCost)} руб")

}