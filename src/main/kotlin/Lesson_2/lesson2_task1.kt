package org.example.Lesson_2

fun main() {
    val a1: Float = 3f
    val a2: Float = 4f
    val a3: Float = 3f
    val a4: Float = 5f

    val numberOfStudents = 4
    val average = (a1 + a2 + a3 + a4) / numberOfStudents

//    println("%.2f".format(average))
    println(String.format("%.2f", average))
}