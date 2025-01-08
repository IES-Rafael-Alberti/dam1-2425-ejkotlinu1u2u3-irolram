package Unidad2

fun main(){

    val contraAlmacenada = "arte"
    println("Escriba su contraseña: ")
    val contraseñaUsu: String? = readLine()
    if(contraseñaUsu != null && contraseñaUsu.equals(contraAlmacenada, ignoreCase = true)){
        print("ta bueno")
    }else{
        println("Ta malo")
    }

}