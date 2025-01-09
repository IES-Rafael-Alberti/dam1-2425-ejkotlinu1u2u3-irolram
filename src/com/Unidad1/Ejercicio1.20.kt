package com.Unidad1

fun ejercicio120() {
    println("Introduce su numero de telefono: ")
    val telefono: String? = readLine()

    if(telefono != null && telefono.length >= 5){
        val sin3y2 = telefono.substring(3,telefono.length - 3)
        print("El resultado es: $sin3y2")
    }else{
        println("ERRRRRROR")
    }
}





