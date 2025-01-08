package Unidad1

fun ejercicio126(){
    println("Introduzca los productos separados por ,: ")
    val entradas: String? = readLine()
    if (entradas != null){
        val productos = entradas.split(",")
        println("Productos de la cesta de compra")
        for(producto in productos){
            println(producto.trim())
        }

    }else{
        println("ERROR")
    }

}