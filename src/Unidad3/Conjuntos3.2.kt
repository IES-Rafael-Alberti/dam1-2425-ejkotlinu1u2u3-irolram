package Unidad3

fun Conjuntos.3.2() {
    val alumnosDePrimaria = mutableListOf<String>()

    println("Introduce los nombres de los alumnos de primaria (ingresa 'x' para finalizar): ")
    var nombrePrimaria: String? = readLine()
    while (nombrePrimaria?.lowercase(Locale.getDefault()) != "x") {
        alumnosDePrimaria.add(nombrePrimaria ?: "")
        nombrePrimaria = readLine()
    }

    val alumnosSecundaria = mutableListOf<String>()

    println("Introduce los nombres de los alumnos de secundaria (ingresa 'x' para finalizar): ")
    var nombreDeSecundaria: String? = readLine()
    while (nombreDeSecundaria?.lowercase(Locale.getDefault()) != "x") {
        alumnosSecundaria.add(nombreDeSecundaria ?: "")
        nombreDeSecundaria = readLine()
    }

    println("Alumnos de primaria: ${alumnosDePrimaria.joinToString(", ")}")
    println("Alumnos de secundaria: ${alumnosSecundaria.joinToString(", ")}")
}