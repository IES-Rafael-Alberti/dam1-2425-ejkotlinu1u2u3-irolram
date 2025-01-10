package com.Unidad2

fun excepciones23(){
    println("Escrinba un numero: ")
    val numero: Int? = readLine()?.toIntOrNull()
    if (numero != null && numero > 0) {
        val atras = (numero downTo 0).toList()
        val sepatras = atras.joinToString(", ")
            println("La cuenta atra es : $sepatras")
    }else{
        println("ERROR")
    }
}