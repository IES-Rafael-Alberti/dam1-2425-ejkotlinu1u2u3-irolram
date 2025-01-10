package com.Unidad3

fun Conjuntos32() {
    val alumnosDePrimaria = mutableListOf<String>()

    println("Introduce los nombres de los alumnos de primaria (ingresa x para finalizar): ")
    var nombrePrimaria: String? = readLine()
    while (nombrePrimaria != null && nombrePrimaria.lowercase() != "x") {
        alumnosDePrimaria.add(nombrePrimaria ?: "")
        nombrePrimaria = readLine()
    }

    val alumnosSecundaria = mutableListOf<String>()

    println("Introduce los nombres de los alumnos de secundaria (ingresa 'x' para finalizar): ")
    var nombreDeSecundaria: String? = readLine()
    while (nombreDeSecundaria != null && nombreDeSecundaria.lowercase() != "x") {
        alumnosSecundaria.add(nombreDeSecundaria ?: "")
        nombreDeSecundaria = readLine()
    }

    println("Alumnos de primaria: ${alumnosDePrimaria.joinToString(", ")}")
    println("Alumnos de secundaria: ${alumnosSecundaria.joinToString(", ")}")
}