package com.Unidad1

fun ejercicio125() {
    println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa:")
    val fechaNacimiento: String? = readLine()

    if (fechaNacimiento != null) {
        // Dividir la cadena de fecha en partes utilizando "/"
        val partesFecha = fechaNacimiento.split("/")

        if (partesFecha.size == 3) {
            // Obtener día, mes y año
            val dia = partesFecha[0].toIntOrNull()
            val mes = partesFecha[1].toIntOrNull()
            val anio = partesFecha[2].toIntOrNull()


            if (dia != null && mes != null && anio != null) {
                println("Día: $dia")
                println("Mes: $mes")
                println("Año: $anio")
            } else {
                println("Error: Fecha no valida.")
            }
        } else {
            println("Error:2")
        }
    } else {
        println("Error3")
    }
}