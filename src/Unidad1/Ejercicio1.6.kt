package Unidad1

fun ejercicio16() {
    println("Escriba el importe final de su pedido")
    var impSinIva: Int  = readLine()?.toIntOrNull()?:0
    val iva = 0.10
    var impConIva = (impSinIva * iva)
    var importeTotal: Double = impConIva + impSinIva
    println("Su importe sin iva es $impSinIva y con iva es $importeTotal")
}