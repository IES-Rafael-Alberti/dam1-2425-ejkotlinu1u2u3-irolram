package com.Unidad3


fun menuUnidad3() {
    println("Bienvenido al Menú de la Unidad 3")

    var salir = false
    try {
        while (!salir){
            println("Elija a continuación el ejercicio que desee probar del 1 al 19 y pulse 0 para salir: ")
            var ejercicio_para_probar = readln().toInt()


            when (ejercicio_para_probar){
                1 -> Conjuntos31()
                2 -> Conjuntos32()
                //3 -> Conjuntos33()
                4 -> Conjuntos34()
                5 -> Conjuntos35()
                6 -> Conjuntos36()
                7 -> Dicc33()
                8 -> Dicc35()
                9 -> Dicc36()
                10 -> Dicc37()
                11 -> Dicc38()
                12 -> Dicc310()
                //13 -> Dicc311()
                14 -> LyT34()
                15 -> LyT36()
                16 -> LyT38()
                17 -> LyT39()
                18 -> LyT310()
                19 -> LyT313()
                0 -> salir = true
                else -> println("Opción no válida")
            }
        }
    }catch (e:NumberFormatException){
        println("Por favor introduce un número válido")
    }



}