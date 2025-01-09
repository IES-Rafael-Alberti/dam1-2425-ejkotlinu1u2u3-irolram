package com.Unidad2

fun main(){
    println("Escriba su nombre: ")
    val nombre: String? = readLine()
    println("Ingrese sexo (F/M): ")
    val sexo: String? = readLine()
    val primeraLetraNombre = nombre?.firstOrNull() ?: ' '
    if (nombre != null && sexo != null && (sexo.equals("M", ignoreCase = true)|| sexo.equals("F", ignoreCase = true))){
        if (sexo == "F" && primeraLetraNombre < 'M' ||  (sexo == "M") && primeraLetraNombre > 'N'){
    println("Grupo A")
        }else{
            println("Grupo b")
        }

    }else {
        println("Error, no rellenó las preguntas")
    }
}