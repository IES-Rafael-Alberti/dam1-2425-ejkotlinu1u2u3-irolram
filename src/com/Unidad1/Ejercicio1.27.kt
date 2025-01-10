package com.Unidad1

fun ejercicio127() {

    println("Introduce el nombre del producto:")
    val nombreProducto: String? = readLine()
    println("Introduce el precio unitario del producto:")
    val precioUnitario: Double? = readLine()?.toDoubleOrNull()
    println("Introduce el número de unidades:")
    val numeroUnidades: Int? = readLine()?.toIntOrNull()

    if (nombreProducto != null && precioUnitario != null && numeroUnidades != null && precioUnitario >= 0 && numeroUnidades > 0) {
        // Costo total
        val costoTotal = precioUnitario * numeroUnidades

        // Formatear la salida según las especificaciones
        val salidaFormateada = "%-20s %10.2f %10d %14.2f".format(nombreProducto, precioUnitario, numeroUnidades, costoTotal)

        // Mostrar la salida formateada
        println(salidaFormateada)
    } else {
        println("Error: Ingresa datos válidos para el nombre, precio y número de unidades.")
    }
}