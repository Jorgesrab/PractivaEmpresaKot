package Objetos

class Libro(val titulo: String, val autor: String, val anioPublicado: Int) {
    fun info() {
        println("Libro con titulo: $titulo, autor: $autor, publicado en el año $anioPublicado")
    }

    fun infoString(): String {
        return "\"$titulo\" - $autor ($anioPublicado"
    }
}

fun main() {
    val libro1: Libro = Libro("Pepito Grillo","Mi padre",2000)
    val libro2 = Libro("La vida de Pou","Jorge",2023)

    libro1.info()
    println(libro2.infoString())
}