package Unidad3

fun main(){
     val  precios = listOf(50,75,46,22,80,65,8)
    if (precios.isNotEmpty()){
        val meprecio = precios.minOrNull()
        val maprecio = precios.maxOrNull()

        if (meprecio != null && maprecio != null){
            println("El menor precio es: $meprecio")
            println("El mayor precio es: $maprecio")
        }else{
            println("ERROR")
        }
    }else{
        println("ERROR")
    }
}