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

    var salir = false
    try {
        while (!salir){
            println(menu)
            var unidad = readLine()?.toInt()
            when(unidad){
                1 -> menuUnidad1()
                2 -> menuUnidad2()
                3 -> menuUnidad3()
                0 -> salir = true
                else -> println("Número inválido")

            }
        }
    }catch (e:NumberFormatException){
        println("Por favor introduce un número válido")
    }


}
