package com.Unidad1


fun ejercicio14(){

    println("Escriba la temperatura en Celsius: ")
    val celsius: Int = readLine()?.toIntOrNull() ?: 0
    val fah: Double = (celsius * 9.0/5.0) + 32.0
    println("Los grados de Celsius cambiados a fah son $fah")
}
