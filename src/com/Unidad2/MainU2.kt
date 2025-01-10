package com.Unidad2

fun menuUnidad2() {
    println("Bienvenido al Menú de la Unidad 2")

    var salir = false
    try {
        while (!salir){

            println("Elija a continuación el ejercicio que desee probar desde 1 al 18, elija 0 para salir: ")
            var ejercicio_para_probar2 = readln().toInt()


            when (ejercicio_para_probar2){
                1 -> condicionales22()
                2 -> condicionales23()
                3 -> condicionales26()
                4 -> condicionales28()
                5 -> condicionales210()
                6 -> excepciones22()
                7 -> excepciones23()
                8 -> excepciones24()
                9 -> iterativas22()
                10 -> iterativas24()
                11 -> iterativas26()
                12 -> iterativas27()
                13 -> iterativas28()
                14 -> iterativas213()
                15 -> iterativas215()
                16 -> iterativas218()
                17 -> iterativas219()
                18 -> iterativas225()
                0 -> salir = true
                else -> println("Opción no válida")
            }
        }
    }catch (e:NumberFormatException){
        println("Por favor introduce un número válido")
    }


}