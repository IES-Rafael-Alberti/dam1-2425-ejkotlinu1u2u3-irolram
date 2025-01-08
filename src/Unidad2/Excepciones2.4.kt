package Unidad2

fun main(){
    try {
        println("Escriba un numero entero: ")
        val numero: Int? = readLine()?.toIntOrNull() ?: throw NumberFormatException("La entrada no es un numero entero")
        println("Numero: $numero")
    }catch (e: NumberFormatException){
        println("Error en: ${e.message}")
    }
}