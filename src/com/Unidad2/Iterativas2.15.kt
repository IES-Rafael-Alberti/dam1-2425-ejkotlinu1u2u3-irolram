package com.Unidad2

fun iterativas215() {
    println("Introduce un numero: ")
    var entradaNum: Int? = readLine()?.toIntOrNull()
    var sumatoria = 0

    while (entradaNum != 0) {
        // Acumula el primer numero.
        sumatoria += entradaNum!!

        println("Introduce otro numero o 0 para finalizar:")
        //siguiente número.
        entradaNum = readLine()?.toIntOrNull()
    }

    println("La sumatoria de los números ingresados es: $sumatoria")
    println("Programa finalizado.")
}