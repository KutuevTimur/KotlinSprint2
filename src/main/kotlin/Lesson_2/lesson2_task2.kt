package org.example.Lesson_2

fun main() {

    val permanentEmployees: Int = 50
    val permanentSalary: Int = 30000
    val interns: Int = 30
    val internSalary: Int = 20000

    val permanentExpenses: Int = permanentEmployees * permanentSalary
    val totalExpenses: Int = permanentExpenses + internSalary * interns
    val totalEmployees: Int = permanentEmployees + interns
    val averageSalary = totalExpenses / totalEmployees

    println("Расходы на выплату зарплаты постоянных сотрудников : $permanentExpenses")
    println("Общие расходы после прихода стажеров: $totalExpenses рублей")
    println("Средняя зарплата одного одного сотрудника после прихода стажеров : $averageSalary")

}