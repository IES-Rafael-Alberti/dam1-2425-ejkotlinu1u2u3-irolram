package com.Unidad2

fun iterativas24(){
    println("Introduzca un número mayor que 0: ")
    val numero: Int? = readLine()?.toIntOrNull()
    if (numero != null && numero > 0){
        val impar = (1..numero step 2).toList()
        val imparjuntos = impar.joinToString(", ")
        println("Los numeros impares son: $imparjuntos ")
    }else{
        println("Error")
    }
}