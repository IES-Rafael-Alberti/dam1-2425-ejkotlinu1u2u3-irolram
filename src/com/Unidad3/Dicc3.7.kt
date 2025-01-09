package com.Unidad3

fun Dicc.3.7() {
    val cesta = mutableMapOf<String, Double>()
    var continuar = true
    while (continuar) {
        println("Que articulo deseas registrar: ")
        val articulo: String = readln()

        if (articulo.equals("Terminar", ignoreCase = true)) {
            continuar = false
        } else {
            println("Que precio tiene $articulo: ")
            val valor: Double? = readln().toDoubleOrNull()
            if (valor != null) {
                cesta[articulo] = valor

            }

        }

        }
    println("El contenido final de la cesta es: ")
    for ((key, value) in cesta) {
        println("$key: $value")


    }
    val total = cesta.values.sum()
    println("Total: $total")
}
