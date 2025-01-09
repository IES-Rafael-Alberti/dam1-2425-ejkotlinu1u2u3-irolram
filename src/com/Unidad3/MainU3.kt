package com.Unidad3


fun menuUnidad3() {
    println("Bienvenido al Menú de la Unidad 3")
    println("Elija a continuación el ejercicio que desee probar: ")
    var ejercicio_para_probar = readline()

    when (ejercicio_para_probar){
        1 -> Conjuntos.3.1()
        2 -> Conjuntos.3.2()
        3 -> Conjuntos.3.3()
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