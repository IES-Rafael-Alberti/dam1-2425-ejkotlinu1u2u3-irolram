package com.Unidad3

fun conjuntoPotencia(s: Set<Int>): List<Set<Int>> {

    if (s.isEmpty()) return listOf(emptySet())

    val elemento = s.first()

    val subconjuntosRestantes = conjuntoPotencia(s - elemento)

    val nuevosSubconjuntos = subconjuntosRestantes.map { it + elemento }

    return subconjuntosRestantes + nuevosSubconjuntos
}

fun main() {
    // Ejemplo de uso
    val conjunto = setOf(6, 1, 4)
    val resultado = conjuntoPotencia(conjunto)
    println(resultado)
}

