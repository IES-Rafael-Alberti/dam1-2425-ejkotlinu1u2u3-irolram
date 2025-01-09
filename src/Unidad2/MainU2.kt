package com.Unidad2

fun menuUnidad2() {
    println("Bienvenido al Menú de la Unidad 2")

    println("Elija a continuación el ejercicio que desee probar: ")
    var ejercicio_para_probar = readline()

    when (ejercicio_para_probar){
        1 -> Condicionales.2.2()
        2 ->
        3 ->
        4 -> Conjuntos.3.4()
        5 -> Conjuntos.3.5()
        6 -> Conjuntos.3.6()
        7 -> Dicc.3.3()
        8 -> Dicc.3.5()
        9 -> Dicc.3.6()
        10 -> Dicc.3.7()
        11 -> Dicc.3.8()
        12 -> Dicc.3.10()
        13 -> Dicc.3.11()
        14 -> LyT.3.4()
        15 -> LyT.3.6()
        16 -> LyT.3.8()
        17 -> LyT.3.9()
        18 -> LyT.3.10()
        19 -> LyT.3.13()
    }
}