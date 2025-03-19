package Condicionales


fun main(){
    val numero = 78

    //Condicional if else
    if (numero % 2 == 0 ){
        println("El número $numero es par")
    } else {
        println("El número $numero es impar")
    }


    var suma = 0
    for (i in 1..5){
        suma += i
    }
    println("La suma de los primeros 5 números es: $suma")
}