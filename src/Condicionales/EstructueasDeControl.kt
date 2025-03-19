package Condicionales

// Ejemplo completo de estructuras de control en Kotlin

fun main() {
    // --------------------
    // ESTRUCTURA IF / ELSE
    // --------------------
    val numero = 7
    if (numero % 2 == 0) {
        println("$numero es par")
    } else {
        println("$numero es impar")
    }

    // ESTRUCTURA IF - ELSE IF - ELSE
    val nota = 8.5
    if (nota >= 9) {
        println("Excelente")
    } else if (nota >= 7) {
        println("Bueno")
    } else if (nota >= 5) {
        println("Regular")
    } else {
        println("Insuficiente")
    }

    // --------------------
    // EXPRESIÓN WHEN
    // --------------------
    // Uso de when similar a switch en otros lenguajes
    val dia = 3
    when (dia) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6, 7 -> println("Fin de semana")
        else -> println("Día inválido")
    }

    // Uso de when con comprobación de tipos
    val objeto: Any = "Hola"
    when (objeto) {
        is Int -> println("Es un número entero")
        is String -> println("Es una cadena de texto")
        else -> println("Tipo desconocido")
    }

    // --------------------
    // BUCLE FOR
    // --------------------
    // Iterar sobre un rango
    println("Bucle FOR sobre un rango:")
    for (i in 1..5) {
        println("Valor: $i")
    }

    // Iterar sobre una lista
    val listaFrutas = listOf("manzana", "banana", "cereza")
    println("Bucle FOR sobre una lista:")
    for (fruta in listaFrutas) {
        println("Fruta: $fruta")
    }

    // Iterar sobre una lista con índices
    println("Bucle FOR con índices:")
    for ((indice, fruta) in listaFrutas.withIndex()) {
        println("Índice $indice: $fruta")
    }

    // --------------------
    // BUCLE WHILE
    // --------------------
    println("Bucle WHILE:")
    var contador = 0
    while (contador < 3) {
        println("Contador: $contador")
        contador++
    }

    // --------------------
    // BUCLE DO-WHILE
    // --------------------
    println("Bucle DO-WHILE:")
    var numeroDoWhile = 0
    do {
        println("Número do-while: $numeroDoWhile")
        numeroDoWhile++
    } while (numeroDoWhile < 3)

    // --------------------
    // BREAK Y CONTINUE
    // --------------------
    println("Bucle FOR con break y continue:")
    for (i in 1..10) {
        if (i == 3) {
            println("Salta el valor 3")
            continue  // Salta la iteración actual y continúa con la siguiente
        }
        if (i == 8) {
            println("Rompe el bucle al llegar a 8")
            break  // Sale del bucle
        }
        println("Valor: $i")
    }

    // --------------------
    // MANEJO DE EXCEPCIONES: TRY - CATCH - FINALLY
    // --------------------
    println("Manejo de excepciones con try-catch-finally:")
    try {
        val division = 10 / 0
        println("Resultado: $division")
    } catch (e: ArithmeticException) {
        println("Error: División por cero")
    } finally {
        println("Bloque finally: siempre se ejecuta")
    }
}
