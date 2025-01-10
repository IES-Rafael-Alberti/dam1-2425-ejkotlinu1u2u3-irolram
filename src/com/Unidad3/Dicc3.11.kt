package com.Unidad3

fun generarDiccionario() {
    val directorio = """
        nif;nombre;email;teléfono;descuento
        01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5
        71476342J;Macarena Ramírez;macarena@mail.com;692839321;8
        63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2
        98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7
    """.trimIndent()

    val clientes = mutableMapOf<String, Map<String, Any>>()

    val lineas = directorio.split("\n") // Separar por líneas el directorio
    val claves = lineas[0].split(";") // Primer línea con los nombres de los campos

    for (linea in lineas.drop(1)) {
        if (linea.isNotBlank()) {
            val valores = linea.split(";") // Separar cada línea en sus valores
            val nif = valores[0] // El primer valor es el NIF

            val informacionCliente = mutableMapOf<String, Any>()
            for (i in 1 until claves.size) { // Empezamos en 1 porque la primera columna es el NIF
                val clave = claves[i]
                val valor = valores[i]
                informacionCliente[clave] = valor
            }

            clientes[nif] = informacionCliente
        }
    }

    println(clientes)
}

fun main() {
    generarDiccionario()
}
