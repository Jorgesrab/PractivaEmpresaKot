package Funciones

//Función que no devuelve valor
fun saludar(nombre: String){
    println("Hola, $nombre")
}

//Función que devuelve un valor entero
fun sumar(a: Int , b: Int ): Int{
    return a + b
}

fun main(){
    saludar("Jorge")
    val resultado = sumar(5, 10)
    println("La suma es: $resultado")
}