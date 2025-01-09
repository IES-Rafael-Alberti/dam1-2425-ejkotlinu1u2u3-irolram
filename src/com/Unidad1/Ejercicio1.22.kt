package com.Unidad1

fun ejercicio122(){
    println("Escribe una frase: ")
    val frase: String? = readLine()

    if(frase != null){
        println("Elige una vocal: ")
        val vocal: String? = readLine()

        if (vocal != null && vocal.length == 1) {
            val fraseconvocal = frase.replace("[aeiouAEIOU]".toRegex(), vocal)
            println("Su frase remplazada es $fraseconvocal")
        }else{
            println("ERROR")
        }
    }else{
        print("ERROR")
    }

}


