package com.Unidad2

fun main(){
    println("Escriba un número: ")
    val uno: Int? = readLine()?.toIntOrNull()
    println("Escriba otro número: ")
    val dos: Int? = readLine()?.toIntOrNull()

    if(uno != null && dos != null && dos != 0){
        val division: Float = uno.toFloat()/dos.toFloat()
        println("El resultado de la división ha sido $division")
    } else{
        println("Error")
    }
}