package com.Unidad1

import com.main


fun menuUnidad1() {
        println("Bienvenido al Menú de la Unidad 1")

        var salir = false

    try {
        while (!salir){
            println("Elija a continuación el ejercicio que desee probar desde el 1 al 12, si quiere salir introduzca 0: ")
            var ejercicio_para_probar = readln().toInt()


            when (ejercicio_para_probar){
                1 -> ejercicio14()
                2 -> ejercicio16()
                3 -> ejercicio112()
                4 -> ejercicio115()
                5 -> ejercicio118()
                6 -> ejercicio120()
                7 -> ejercicio121()
                8 -> ejercicio122()
                9 -> ejercicio124()
                10 -> ejercicio125()
                11 -> ejercicio126()
                12 -> ejercicio127()
                0 -> salir = true
                else -> println("Opción no válida")
            }

        }
    }catch (e:NumberFormatException){
        println("Por favor introduce un número válido")
    }


}