package Unidad3

fun main(){
    val diccasignaturas = mapOf("Matematicas" to  6, "Fisica" to  4, "Quimica" to 5)

    for ((asignatura, creditos) in diccasignaturas){
        println("$asignatura tiene $creditos creditos")
    }
    val total = diccasignaturas.values.sum()
    println("La suma de los creditos es: $total")
}