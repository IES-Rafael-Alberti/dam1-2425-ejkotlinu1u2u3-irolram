package com.Unidad2

fun iterativas22(){
    println("Introduzca su edad: ")
    val edad: Int? = readLine()?.toIntOrNull()
    if(edad != null && edad > 0){
       println("Años que ha cumplido")
       for (i in 1..edad)
           println("ha cumplido $i años")
    }else{
        println("Pete")
    }
}