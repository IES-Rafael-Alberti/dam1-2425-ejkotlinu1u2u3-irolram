package com.Unidad2

fun iterativas225(){
    println("Escriba una frase: ")
    val info: String? =  readLine()
    if (info != null && info.isNotBlank()) {
        val palabras = info.split(" ")
        var palabrasLarga = ""
        for (palabra in palabras){
            if (palabra.length > palabrasLarga.length){
                palabrasLarga = palabra
            }
        }
        println("La palabra larga es $palabrasLarga")
        println("Cantidad de palabras son: ${palabras.size}")
    } else{
        println("Error")
    }
}