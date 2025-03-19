package Objetos

class Persona(val nombre: String, var edad: Int) {
    fun presentarse(){
        println("Hola, me llamo $nombre y tengo $edad años.")
    }

}

fun main(){
    val persona1 = Persona("Pepe", 37)
    persona1.presentarse()
    //Seria com el setter
    persona1.edad = 33
    persona1.presentarse()
}