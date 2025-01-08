package Unidad2

fun main(){
    var continuar = true
    while(continuar) {
        print("Menú: 1- Comenzar programa, 2- imprimir listado, 3-finalizar")
        val elegirmenu: Int? = readLine()?.toIntOrNull()
        if (elegirmenu != null && elegirmenu in 1..3) {
            when (elegirmenu) {
                1 -> {
                    print("Iniciando programa")
                }

                2 -> {
                    println("Imprimiendo listado")
                }

                3 -> {
                    println("Finalizando")
                    continuar = false
                }

                else -> {
                    println("Opcion invalida")

                }
            }
        }
    }
}