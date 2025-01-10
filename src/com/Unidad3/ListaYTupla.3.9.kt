package com.Unidad3

fun LyT39(){
    println("Ingresa una palabra: ")
    val palabra = readLine() ?: ""

    val conteoV = mutableMapOf<Char, Int>().withDefault { 0 }

    for (letra in palabra) {
        val letraSinDistincion = if (letra in 'A'..'Z') letra + ('a' - 'A') else letra
        if (letraSinDistincion in setOf('a', 'e', 'i', 'o', 'u')) {
            conteoV[letraSinDistincion] = conteoV.getValue(letraSinDistincion) + 1
        }
    }
    println("Resultado")
    for((vocal, conteo) in conteoV){
        println("$vocal, $conteo")
    }
}