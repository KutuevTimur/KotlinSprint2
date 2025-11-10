package org.example.lesson_5

const val UNDERWEIGHT_LIMIT = 18.5
const val NORMAL_LIMIT = 25.0
const val OVERWEIGHT_LIMIT = 30.0
const val CM_IN_METRE = 100.0

fun main() {
    print("Введите вес (кг): ")
    val weight = readln().toDouble()

    print("Введите рост (см): ")
    val heightCm = readln().toDouble()

    val heighM = heightCm / CM_IN_METRE
    val bmi = weight / (heighM * heighM)

    val category = when {
        bmi < UNDERWEIGHT_LIMIT -> "Недостаточная масса тела"
        (UNDERWEIGHT_LIMIT < bmi) && (bmi < NORMAL_LIMIT) -> "Нормальная масса тела"
        (NORMAL_LIMIT < bmi) && (bmi < OVERWEIGHT_LIMIT) -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("РЕЗУЛЬТАТЫ:")
    println("ИМТ: ${"%.2f".format(bmi)}")
    println("Категория: $category")
}