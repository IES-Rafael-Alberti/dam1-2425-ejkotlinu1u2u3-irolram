package com.Unidad2

fun iterativas213(){
    println("Escriba algun texto, introduzca 'salir' para finalizar: ")
    var entrada: String? = readLine()
    while (entrada?.lowercase() != "salir"){
        println("Eco: $entrada")
        println("Introduce texto para seguir o 'salir' para finalizar: ")
        entrada = readLine()
    }
    println("Fin")
}