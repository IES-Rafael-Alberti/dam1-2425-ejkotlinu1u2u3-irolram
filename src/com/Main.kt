package com
import com.Unidad1.menuUnidad1
import com.Unidad2.menuUnidad2
import com.Unidad3.menuUnidad3

fun main(){
    val menu = """
        MENÚ
        Introduce el número de la unidad a la que desea acceder: 
            1 -> menuUnidad1()
            2 -> menuUnidad2()
            3 -> menuUnidad3()
            0 -> Salir
    """.trimIndent()

    println(menu)
    var unidad = readLine()?.toInt()

    when(unidad){
        1 -> menuUnidad1()
        2 -> menuUnidad2()
        3 -> menuUnidad3()
        0 -> println("Adios")
        else -> println("Número inválido")
    }
}
