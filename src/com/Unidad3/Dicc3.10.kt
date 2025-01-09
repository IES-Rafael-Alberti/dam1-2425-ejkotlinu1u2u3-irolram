package com.Unidad3

fun Dicc.3.10() {
    val baseDeDatosClientes = mutableMapOf<String, MutableMap<String, Any>>()

    while (true) {
        println("Menú:")
        println("(1) Añadir cliente")
        println("(2) Eliminar cliente")
        println("(3) Mostrar cliente")
        println("(4) Listar todos los clientes")
        println("(5) Listar clientes preferentes")
        println("(6) Terminar")

        print("Ingrese una opción: ")
        val opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                // Añadir cliente
                val cliente = agregarCliente()
                baseDeDatosClientes[cliente["NIF"] as String] = cliente
                println("Cliente agregado con éxito.")
            }
            2 -> {
                // Eliminar cliente
                eliminarCliente(baseDeDatosClientes)
            }
            3 -> {
                // Mostrar cliente
                mostrarCliente(baseDeDatosClientes)
            }
            4 -> {
                // Listar todos los clientes
                listarClientes(baseDeDatosClientes)
            }
            5 -> {
                // Listar clientes preferentes
                listarClientesPreferentes(baseDeDatosClientes)
            }
            6 -> {
                // Terminar el programa
                println("Programa terminado.")
                return
            }
            else -> {
                println("Opción no válida. Por favor, ingrese una opción válida.")
            }
        }
    }
}

fun agregarCliente(): MutableMap<String, Any> {
    val cliente = mutableMapOf<String, Any>()

    print("Ingrese el NIF del cliente: ")
    cliente["NIF"] = readLine()?.trim() ?: ""

    print("Ingrese el nombre del cliente: ")
    cliente["Nombre"] = readLine()?.trim() ?: ""

    print("Ingrese la dirección del cliente: ")
    cliente["Dirección"] = readLine()?.trim() ?: ""

    print("Ingrese el teléfono del cliente: ")
    cliente["Teléfono"] = readLine()?.trim() ?: ""

    print("Ingrese el correo del cliente: ")
    cliente["Correo"] = readLine()?.trim() ?: ""

    print("¿Es cliente preferente? (true/false): ")
    val esPreferente = readLine()?.toBoolean() ?: false
    cliente["Preferente"] = esPreferente

    return cliente
}

fun eliminarCliente(baseDeDatosClientes: MutableMap<String, MutableMap<String, Any>>) {
    print("Ingrese el NIF del cliente que desea eliminar: ")
    val nif = readLine()

    if (baseDeDatosClientes.containsKey(nif)) {
        baseDeDatosClientes.remove(nif)
        println("Cliente eliminado con éxito.")
    } else {
        println("Cliente con NIF $nif no encontrado en la base de datos.")
    }
}

fun mostrarCliente(baseDeDatosClientes: Map<String, MutableMap<String, Any>>) {
    print("Ingrese el NIF del cliente que desea mostrar: ")
    val nif = readLine()

    if (baseDeDatosClientes.containsKey(nif)) {
        val cliente = baseDeDatosClientes[nif]
        println("Datos del cliente:")
        println("NIF: ${cliente?.get("NIF")}")
        println("Nombre: ${cliente?.get("Nombre")}")
        println("Dirección: ${cliente?.get("Dirección")}")
        println("Teléfono: ${cliente?.get("Teléfono")}")
        println("Correo: ${cliente?.get("Correo")}")
        println("Preferente: ${cliente?.get("Preferente")}")
    } else {
        println("Cliente con NIF $nif no encontrado en la base de datos.")
    }
}

fun listarClientes(baseDeDatosClientes: Map<String, MutableMap<String, Any>>) {
    println("Lista de todos los clientes:")
    for ((nif, cliente) in baseDeDatosClientes) {
        println("NIF: $nif, Nombre: ${cliente["Nombre"]}")
    }
}

fun listarClientesPreferentes(baseDeDatosClientes: Map<String, MutableMap<String, Any>>) {
    println("Lista de clientes preferentes:")
    for ((nif, cliente) in baseDeDatosClientes) {
        if (cliente["Preferente"] == true) {
            println("NIF: $nif, Nombre: ${cliente["Nombre"]}")
        }
    }
}