package Unidad2

fun main(){
    println("Ingrese su puntuación (0.0, 0.4, 0.6...): ")
    val puntuacion: Double? = readLine()?.toDouble()
    val salario = 2400
    if(puntuacion != null){
        val cantidadDinero = salario * puntuacion

        when {
            puntuacion == 0.0 -> println("Su cantidad de dinero conseguido es de $cantidadDinero")
            puntuacion == 0.4 -> println("Su cantidad de dinero conseguido es de $cantidadDinero")
            puntuacion >= 0.6 -> println("Su cantidad de dinero conseguido es de $cantidadDinero")
            else -> println("Error: Puntuación no válida")
        }

    }else{
        println("Puntuación no válida")
    }

}