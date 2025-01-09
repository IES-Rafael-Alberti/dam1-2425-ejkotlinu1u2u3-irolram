package com.Unidad3

fun Dicc.3.6(){
    val infoUsu = mutableMapOf<String, Any>()
    var continuar = true
    while(continuar) {
        println("Di algo sobre tí o No' para parar: ")
        val clave: String = readln()
        println("Ingrese el valor para $clave ")
        val valor = readln()
        if (clave.equals("No", ignoreCase = true)){
            continuar = false
        }else{
            // info para diccionario
            infoUsu[clave]= valor

            println("El contenido actual del diccionario es: ")
            for((key, value) in infoUsu){
                println("$key: $value")
            }
        }
    }
}