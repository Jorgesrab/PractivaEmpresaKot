package Objetos

// Definimos una clase "Coche"
class Coche(val marca: String, val modelo: String, val anio: Int) {

    // Propiedad calculada (no se necesita almacenamiento explícito)
    val esNuevo: Boolean
        get() = anio >= 2020

    // Constructor secundario (constructor adicional)
    constructor(marca: String, modelo: String) : this(marca, modelo, 2023) {
        println("Este es el constructor secundario, asignando el año por defecto: 2023")
    }

    // Método para mostrar información del coche
    fun mostrarInfo() {
        println("Coche: $marca $modelo, Año: $anio")
    }

    // Sobrescribimos el método toString para devolver una representación personalizada
    override fun toString(): String {
        return "Coche(marca='$marca', modelo='$modelo', anio=$anio, esNuevo=$esNuevo)"
    }

    // Método de comportamiento para el coche
    fun arrancar() {
        println("El coche $marca $modelo está arrancando...")
    }

    fun detener() {
        println("El coche $marca $modelo se ha detenido.")
    }
}

// Función principal para crear y usar objetos
fun main() {
    // Usamos el constructor principal para crear un coche
    val coche1 = Coche("Toyota", "Corolla", 2021)
    coche1.mostrarInfo()      // Muestra la información del coche
    coche1.arrancar()         // Llama al método arrancar
    coche1.detener()          // Llama al método detener
    println(coche1)           // Imprime la representación del objeto usando toString()

    // Usamos el constructor secundario
    val coche2 = Coche("Honda", "Civic")
    coche2.mostrarInfo()      // Muestra la información del coche con el año por defecto (2023)
    println(coche2)           // Imprime la representación del objeto usando toString()

    // Accedemos a la propiedad calculada "esNuevo"
    println("¿Es el coche1 nuevo? ${coche1.esNuevo}")
    println("¿Es el coche2 nuevo? ${coche2.esNuevo}")
}
