package org.example.Lesson_2

fun main() {
    val grade1: Float = 3f
    val grade2: Float = 4f
    val grade3: Float = 3f
    val grade4: Float = 5f

    val numberOfStudents = 4
    val average = (grade1 + grade2 + grade3 + grade4) / numberOfStudents

   println("%.2f".format(average))

}