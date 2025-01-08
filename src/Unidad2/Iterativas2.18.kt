package Unidad2

fun main() {
    println("Introduce un número entero positivo (ingresa 0 para finalizar): ")
    var eNum: Int? = readLine()?.toIntOrNull()

    while (eNum != 0) {
        if (eNum != null && eNum > 0) {
            val sumaDigitos = sumarDigitos(eNum)
            println("La suma de los dígitos de $eNum es: $sumaDigitos")
        } else {
            println("Número no válido.")
        }

        println("Introduce otro número entero positivo o 0 para finalizar:")
        eNum = readLine()?.toIntOrNull()
    }

    println("Programa finalizado.")
}

fun sumarDigitos(numero: Int): Int {
    var suma = 0
    var num = numero

    while (num > 0) {
        suma += num % 10
        num /= 10
    }

    return suma
}