package Condicionales

fun main(){
    val edad = 19
    val categoria = when {
        edad < 12 -> "Niño"
        edad < 18 -> "Adolescente"
        edad < 65 -> "Adulto"
        else -> "Anciano"
    }
    println("La categoría es: $categoria")




    val edad2 = 3
    val categoria2 = when (edad2) {
        in 0..11 -> "Niño"
        in 12..17 -> "Adolescente"
        in 18..64 -> "Adulto"
        else -> "Anciano"
    }
    println("La categoría es: $categoria2")
}
