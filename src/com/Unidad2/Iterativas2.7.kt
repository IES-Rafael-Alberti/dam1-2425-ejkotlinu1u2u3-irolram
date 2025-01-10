package com.Unidad2

fun iterativas27(){
    println("Introduzca la tabla que desea mirar: ")

    val tabla: Int? = readLine()?.toIntOrNull()

    if (tabla != null && tabla >= 0) {
        for (i in 1..10) {
            val multi = tabla * i
            println("$tabla x $i = $multi")
        }
    }else{
        println("Error")
    }
}