package com.Unidad2

fun main(){
    println("¿Quiere una pizza vegetariana? (Sí/No): ")
    val vegane: Boolean = readLine()?.equals("Si", ignoreCase = true) ?: false
    if (vegane){
        ingredientesvegane()
    }else
        ingredientesnovegane()
}
fun ingredientesvegane(){
    println("Ingrdientes para pizzas vegane: Pimientos y tofu")

    println("Elija entre opcion 1 y 2:")
    val opcion: Int? = readLine()?.toIntOrNull()
    if (opcion != null && opcion in 1..2) {
        val ingredientesvegane = when (opcion){
            1 -> "Pimientos"
            2 ->"Tofu"
            else ->"ERROR"
        }
        print("Ha elegido la pizza vegetariana con los siguientes ingredientes: $ingredientesvegane, mozzarella y tomate")
    }else{
        println("Error")
    }
}

fun ingredientesnovegane(){
    println("Ingredientes disponibles para pizzas no vegetarianas: Peperoni, Jamón y Salmón")

    println("Seleccione un ingrediente (1-3): ")
    val opcion: Int? = readLine()?.toIntOrNull()

    if (opcion != null && opcion in 1..3) {
        val ingredientenovegane = when (opcion) {
            1 -> "Peperoni"
            2 -> "Jamón"
            3 -> "Salmón"
            else -> "Error"
        }
        println("Ha elegido la pizza vegetariana con los siguientes ingredientes: $ingredientenovegane, mozzarella y tomate")
    }else{
        println("Error")

    }
}







