package com.Unidad1

fun ejercicio124(){
    println("Precio del producto en euros con dos decimales: ")
    val precio: String? = readLine()
    // Dividimos los euros de los centimos
    if(precio != null){
        val partes = precio.split(".")

        if(partes.size == 2){

            val euros = partes[0].toIntOrNull()
            val centimos = partes[1].toIntOrNull()

            if(euros!= null && centimos != null){
                println("Euros: $euros")
                println("Centimos: $centimos")
            }else{
                println("ERROR1")
            }
        }else{
            println("ERROR2")
        }

    }else {
        println("ERROR3")
    }
}