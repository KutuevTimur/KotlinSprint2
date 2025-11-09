package org.example.lesson_4

const val MIN_CREW_MAIN = 55
const val MAX_CREW_MAIN = 70
const val MIN_PROVISION_MAIN = 50
const val RECOMMENDED_CREW_ALT = 70
const val MIN_PROVISION_ALT = 50

fun main() {
    print("Есть ли повреждения корпуса (true/false): ")
    val hasDamage = readLine()!!.toBoolean()

    print("Введите количество человек экипажа: ")
    val crew = readLine()!!.toInt()

    print("Введите количество ящиков с провизией: ")
    val provision = readLine()!!.toInt()

    print("Благоприятны ли метеоусловия (true/false): ")
    val weatherFavorable = readLine()!!.toBoolean()

    val canSail = ((!hasDamage && crew >= MIN_CREW_MAIN) &&
            (crew <= MAX_CREW_MAIN) &&
            (provision > MIN_PROVISION_MAIN)) ||
            ((hasDamage && crew == RECOMMENDED_CREW_ALT) &&
                    (weatherFavorable && provision >= MIN_PROVISION_ALT))

    println("Может ли корабль отправиться в плавание? $canSail")
}