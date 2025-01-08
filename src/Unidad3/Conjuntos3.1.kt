package Unidad3


fun domicilioFactura(compras: Array<Array<Any>>): Array<String>{

    val facturadomicilio = mutableListOf<String>()
    for (compra in compras){
        val domicilio = compra[3] as String
        if (domicilio !in facturadomicilio){
            facturadomicilio.add(domicilio)
        }
    }
    return facturadomicilio.toTypedArray()

}


fun main(){
    val compras = arrayOf<Array<Any>>(
        arrayOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        arrayOf("Jorge Russo", 7, 699.0, "Mirasol 218"),
        arrayOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        arrayOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        arrayOf("Jorge Russo", 15, 958.0, "Mirasol 218")
    )

    val domicilio = domicilioFactura(compras)
    println("Domicilios para enviar la factura: ${domicilio.joinToString()}")
}