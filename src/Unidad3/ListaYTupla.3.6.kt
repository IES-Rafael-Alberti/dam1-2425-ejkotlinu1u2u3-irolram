package Unidad3

fun main() {
    val asignaturas: MutableList<String> = mutableListOf("Matematicas", "Historia", "Lengua", "Química", "Física")
    val asignaturasAprobadas = mutableListOf<String>()

    for (asignatura in asignaturas.toList()) {
        println("¿Qué nota ha sacado en $asignatura?")
        val nota: Double = readLine()?.toDoubleOrNull() ?: 0.0

        if (nota >= 5.0) {

            asignaturasAprobadas.add(asignatura)
        } else {
            println("Suspendiste $asignatura")
        }
    }

    asignaturas.removeAll(asignaturasAprobadas)

    println("Asignaturas a repetir: $asignaturas")
}