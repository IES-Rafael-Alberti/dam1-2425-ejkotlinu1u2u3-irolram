package com.Unidad3

fun Dicc.3.3(){
    val listfruta = mapOf("Platano" to 1.35, "Manzana" to 0.80, "Pera" to 0.85, "Naranja" to 0.70)
    println("Lista de Frutas : $listfruta")
    println("¿Que fruta quiere?: ")
    val fruta: String? = readLine()
    if (listfruta.containsKey(fruta)){
        println("Ingrese los kilos")
        val kilos = readLine()?.toIntOrNull()

        if (kilos != null && kilos > 0){
            val total = listfruta[fruta]!! * kilos
            println("El coste total será de $total")
        }else {
            println("ERROR")
        }
    }else{
        println("ERROR2")
    }
}