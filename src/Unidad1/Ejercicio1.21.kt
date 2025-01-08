package Unidad1

fun ejercicio121(){
    println("Introduce una frase: ")
    val frase:  String? = readLine()
    val invefrase = frase?.reversed()
    println("Su frase invertida es $invefrase")
}