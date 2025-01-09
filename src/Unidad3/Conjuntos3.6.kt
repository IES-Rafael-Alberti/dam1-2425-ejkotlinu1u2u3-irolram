package Unidad3

fun Conjuntos.3.6(){
    val vocales = mutableSetOf('a', 'e', 'i', 'o', 'u')
    val consonantes = setOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
    val letras_comunes = consonantes.intersect(vocales)

    println("Consonantes: $consonantes")
    println("Letras comunes: $letras_comunes")
}