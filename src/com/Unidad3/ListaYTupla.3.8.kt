package com.Unidad3

fun LyT38(){
    println("Escribe una palabra: ")
    val palin: String? = readLine()
    if(palin != null){
        if (palin == palin.reversed()){
            println("La palabra es un palíndromo")
        }else{
            println("No es un palíndromo")
        }
    }else{
        println("ERROR")
    }
}