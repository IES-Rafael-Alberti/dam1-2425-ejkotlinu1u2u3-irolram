package Unidad3

fun Conjuntos.3.4(){
    val set_frutas1 = mutableSetOf ("manzana", "pera", "naranja", "plátano", "uva")
    val set_frutas2 = mutableSetOf ("manzana", "pera", "durazno", "sandía", "uva")

    val frutas_comunes = mutableSetOf<String>()
    val frutas_solo_en_frutas2 = mutableSetOf<String>()
    val frutas_solo_en_frutas1 = mutableSetOf<String>()

    for (fruta in set_frutas1) {
        if (fruta in set_frutas2){
            frutas_comunes.add(fruta)
        }
    }
    println("Frutas comunes: $frutas_comunes")

    for (fruta in set_frutas1) {
        if (fruta !in set_frutas2){
            frutas_solo_en_frutas2.add(fruta)
        }
    }
    println("Frutas en fruta2 nada más: $frutas_solo_en_frutas2")
    for (fruta in set_frutas2) {
        if (fruta !in set_frutas1){
            frutas_solo_en_frutas1.add(fruta)
        }
    }
    println("Frutas en fruta2 nada más: $frutas_solo_en_frutas1")
}
