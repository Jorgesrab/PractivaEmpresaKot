package EjerciciosPracticas.Fibonacci


fun main() {
    var numero: Int?
    do {
        println("Introduce un número positivo")
        numero = readLine()?.toIntOrNull()
        if (numero == null) {
            println("Debes introducir un número")
        } else if (numero < 1) {
            println("El número debe ser superior a 0")
        }
    } while (numero == null || numero < 1)

    val memo = mutableMapOf<Int, Int>()
    println("La secuencia de Fibonacci de $numero es ${calculoFibo(numero, memo)}")
}

fun calculoFibo(n: Int, memo: MutableMap<Int, Int>): Int {
    if (n == 0) return 0
    if (n == 1) return 1

    // Si ya hemos calculado el valor antes, lo devolvemos
    if (memo.containsKey(n)) return memo[n]!!

    // Guardamos el resultado en `memo` para evitar cálculos repetidos
    memo[n] = calculoFibo(n - 1, memo) + calculoFibo(n - 2, memo)
    return memo[n]!!
}





/*
fun main() {
    var numero: Int?
    do {
        println("Introduce un número positivo")
        numero = readLine()?.toIntOrNull()
        if (numero == null) {
            println("Debes introducir un número")
        } else if (numero < 1) {
            println("El número debe ser superior a 0")
        }
    } while (numero == null || numero < 1)

    println("La secuencia fivonacci de $numero es ${calcucloFivo(numero)}")
}

fun calcucloFivo(numero: Int): Int{


    if (numero == 0) return 0
    else if (numero == 1) return 1
    else {
        return calcucloFivo(numero -1)+ calcucloFivo(numero -2)
    }
}

 */