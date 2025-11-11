package org.example.lesson_5

fun main() {
    val registeredUserName = "Zaphod"
    val registeredPassword = "PanGalactic"
    println("Приветствую вас, пожалуйста введите свои данные...")
    print("Имя пользователя: ")
    val username = readln()
    if (username != registeredUserName) {
        println("Пользователь '$username' не найден в системе...")
        println("Вам необходимо зарегистрироваться")
        return
    }
    println("Пользователь $username найден в системе")
    println("Введите пароль, чтобы продолжить")
    print("Пароль: ")
    val password = readln()
    if (password != registeredPassword) {
        println("Доступ запрещен(")
        return
    }

    println("Ваши данные проверены, и о, чудо, они верны...")
    println("Пользователь \"$username\", вам разрешено входить на борт корабля \"Heart of Gold\".")
}