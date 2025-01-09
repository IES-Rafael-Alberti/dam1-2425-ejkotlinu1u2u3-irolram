package Unidad3

fun Dicc.3.8(){
    val dicc = mutableMapOf<String, String>()
    println("Escriba las palabras español e ingles separados por dos puntos: <palabra>:<traducción>")
    val entrada = readLine()

    //Para dividir la entrada:
    val pares = entrada?.split(",")

    if (pares != null) {
        for(par in pares){
            val partes = par.split(":")
            if (partes.size == 2){
                dicc[partes[0]] == partes[1]
            }else{
                println("Formato incorrecto para el par: $par. Ignorando.")
            }
        }
    }else{
        println("ERROR")
    }

    println("Ingrese una frase en español para traducir: ")
    val frase = readln()
    val palabras = frase.split(" ")
    val fraseTraducida = palabras.map { dicc[it] ?: it }

    println("Frase traducida: $fraseTraducida")

}