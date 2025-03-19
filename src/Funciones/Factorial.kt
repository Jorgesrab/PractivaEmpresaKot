package Funciones

fun main() {
    val resultado:Int = 4
    println("El factorial de $resultado es ${factorial(resultado)}")
}


fun factorial(n: Int): Int {
    var resultado: Int = n

    for (i in n downTo  1){

        if (i != resultado){
            resultado *= i

        }

    }
    return resultado
}


/*

fun factorial(n: Int): Int {
    var resultado = 1
    for (i in 1..n) {
        resultado *= i
    }
    return resultado
}

fun main() {
    val numero = 5
    println("El factorial de $numero es ${factorial(numero)}")
}


 */