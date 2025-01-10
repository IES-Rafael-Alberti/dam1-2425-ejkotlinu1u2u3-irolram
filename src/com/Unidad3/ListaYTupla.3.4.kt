package com.Unidad3

fun LyT34(){
    val numerosGanadores = mutableListOf<Int>()

    for(i in 1..6){
        println("Ingrese el numero ganador $i: ")
        val numero: Int = readLine()?.toIntOrNull() ?: run {
            println("Entrada no valida")
            return
        }
        numerosGanadores.add(numero)
    }
    numerosGanadores.sort()
    println("Numeros ganadores de menor a mayor : $numerosGanadores")
}