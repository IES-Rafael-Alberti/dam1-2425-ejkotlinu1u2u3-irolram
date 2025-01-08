package Unidad2

fun main(){
    println("Introduzca un número positivo:")
    val numero: Int? = readLine()?.toIntOrNull()
    if (numero != null && numero > 0){
        val Impar = (1..numero step 2).toList()
        val separarImpar = Impar.joinToString(", ")
        println("Los numeros impares son: $separarImpar ")
    }else{
        println("Error")
    }
}