package com.Unidad2

fun condicionales22(){

    val contraAlmacenada = "arte"
    println("Escriba su contraseña: ")
    val contrasenaUsu: String? = readLine()
    if(contrasenaUsu != null && contrasenaUsu.equals(contraAlmacenada, ignoreCase = true)){
        print("ta bueno")
    }else{
        println("Ta malo")
    }

}