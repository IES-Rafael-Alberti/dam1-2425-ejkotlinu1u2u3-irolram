package com.Unidad3

fun Conjuntos.3.5(){
    val numeros = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = numeros.filter { it % 2 == 0 }.toSet()
    val multiplo_de_tres = numeros.filter { it % 3 == 0 }.toSet()
    val pares_y_multiplos_de_tres = pares.intersect(multiplo_de_tres)

    println("Números pares: $pares")
    println("Múltiplos de tres: $multiplo_de_tres")
    println("Intersección: $pares_y_multiplos_de_tres")
}