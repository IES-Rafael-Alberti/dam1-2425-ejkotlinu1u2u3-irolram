package com.Unidad3

import kotlin.math.sqrt

fun LyT.3.13(){

    println("Di numeros separados por coma:  ")
    var numerox : String = readln()
    var media = 0
    val numeros = numerox.split(',').toList()
    for(numero in numeros){
        media += Integer.valueOf(numero)
    }
    media /= numeros.size
        println("Esto es la media: $media")
    //Desviación típica

    var varianza = 0

    for(numero in numeros){
        varianza += Integer.valueOf(numero)-media

    }
    varianza /= numeros.size -1
       val  desviacion = sqrt(varianza.toDouble())
        println("Desviación tipica es : $desviacion")

}