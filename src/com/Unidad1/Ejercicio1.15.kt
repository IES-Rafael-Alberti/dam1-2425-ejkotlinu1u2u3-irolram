package com.Unidad1



fun ejercicio115() {
    println("Introduce la cantidad de dinero depositada en la cuenta de ahorros:")

    // Lee la cantidad de dinero como una cadena y conviértela a Float o usa null si la conversión falla
    val inversion: Float? = readLine()?.toFloatOrNull()

    if (inversion != null) {
        val interes = 0.04
        var balance = inversion.toDouble()

        // Calcula y muestra el balance después del primer, segundo y tercer año
        for (i in 1..3) {
            balance *= (1 + interes)
            println("Balance tras el año $i: ${"%.2f".format(balance)}")
        }
    } else {
        println("Error: La entrada no es un número válido.")
    }
}