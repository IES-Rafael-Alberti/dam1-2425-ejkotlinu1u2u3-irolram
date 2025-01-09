package com.Unidad2

fun main(){
    println("Introduzca un número entero: ")
    val altura: Int? = readLine()?.toIntOrNull()
    if (altura != null && altura > 0){
        for (i in 1..altura){
            for (j in 1.. i){
                print("*")
            }
            println()
        }

    }else{
        println("ERROR")
    }

}