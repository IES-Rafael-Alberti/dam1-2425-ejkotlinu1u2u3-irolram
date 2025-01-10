package com.Unidad2

fun iterativas28() {
    println("Introduzca un número entero: ")
    val altura: Int? = readLine()?.toIntOrNull()

    if (altura != null && altura > 0) {
        for (i in 1..altura) {
            for (j in i * 2 - 1 downTo 1 step 2) {
                print("$j ")
            }
            println()
        }
    } else {
        println("Error")
    }
}