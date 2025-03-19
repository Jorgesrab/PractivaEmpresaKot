package Variables


// Ejemplo completo de variables y conceptos en Kotlin (sin usar una clase)

// --------------------
// VARIABLES BÁSICAS
// --------------------
val numeroInt: Int = 42                           // Entero
var numeroLong: Long = 100000L                     // Long (sufijo L)
val numeroShort: Short = 10                        // Short
val numeroByte: Byte = 1                           // Byte
val numeroDouble: Double = 3.14                    // Double (decimal de doble precisión)
val numeroFloat: Float = 2.71f                     // Float (sufijo f)

val booleano: Boolean = true                       // Booleano
val caracter: Char = 'K'                           // Carácter
val texto: String = "Hola, Kotlin"                 // Cadena de texto

// --------------------
// TIPOS CON INFERENCIA DE TIPO
// Kotlin deduce el tipo en función del valor asignado
val inferidoEntero = 10                          // Se infiere como Int
var inferidoTexto = "Inferido como String"       // Se infiere como String

// --------------------
// TIPOS NULABLES
// Se indica con "?" que la variable puede contener null
var numeroNulo: Int? = null

// --------------------
// COLECCIONES
val listaNumeros: List<Int> = listOf(1, 2, 3, 4, 5)                    // Lista inmutable
val arrayNumeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)                   // Array
val setPalabras: Set<String> = setOf("uno", "dos", "tres")               // Conjunto (Set)
val mapaDatos: Map<String, Any> = mapOf("clave1" to 1, "clave2" to "dos") // Mapa (Map)
val arrayCualquier: Array<Any> = arrayOf(1, "dos", 3.0, true)             // Array de cualquier tipo

// --------------------
// VARIABLE DE TIPO ANY
// Puede almacenar cualquier tipo de dato
var cualquierCosa: Any = "Puede ser cualquier cosa"

// --------------------
// VARIABLE LAZY (perezosa)
// Se inicializa solo cuando se accede por primera vez
val lazyValue: String by lazy { "Valor perezoso" }

// --------------------
// VARIABLE LATEINIT
// Para variables que se inicializarán después, se usa 'lateinit'
// Nota: no se permite en variables locales o top-level; por ello se encapsula en un objeto.
object LateInitHolder {
    lateinit var noInicializado: String
}

// --------------------
// VARIABLE DE TIPO FUNCIÓN (Lambda)
// Ejemplo de función que suma dos números
val suma: (Int, Int) -> Int = { a, b -> a + b }

// --------------------
// CONSTANTE
// Declarada con 'const val' (solo para valores conocidos en tiempo de compilación)
const val CONSTANTE: String = "Soy una constante"

// --------------------
// DATA CLASS
// Clase simple para almacenar datos
data class Persona(val nombre: String, val edad: Int)
val persona = Persona("Juan", 30)

// --------------------
// ENUM
// Define un conjunto de constantes predefinidas
enum class Direccion {
    NORTE, SUR, ESTE, OESTE
}
val direccion = Direccion.NORTE

// --------------------
// CLASE SELLADA (Sealed class)
// Permite definir una jerarquía de clases con un conjunto limitado de subclases
sealed class Resultado {
    data class Exito(val mensaje: String): Resultado()
    data class Error(val error: String): Resultado()
}
val resultado: Resultado = Resultado.Exito("Operación exitosa")

// --------------------
// FUNCIONES
// --------------------

// Función que retorna Unit (similar a 'void')
fun hacerAlgo(): Unit {
    println("Haciendo algo...")
}

// Función que retorna Nothing (indica que nunca retorna, por ejemplo, lanza una excepción)
fun lanzarExcepcion(): Nothing {
    throw Exception("Error intencional")
}

// --------------------
// FUNCIÓN PRINCIPAL
// --------------------
fun main() {
    println("----- TIPOS BÁSICOS -----")
    println("Int: $numeroInt")
    println("Long: $numeroLong")
    println("Short: $numeroShort")
    println("Byte: $numeroByte")
    println("Double: $numeroDouble")
    println("Float: $numeroFloat")
    println("Boolean: $booleano")
    println("Char: $caracter")
    println("String: $texto")
    println("Inferido (Int): $inferidoEntero")
    println("Inferido (String): $inferidoTexto")

    println("\n----- TIPOS NULABLES -----")
    println("Nullable Int: $numeroNulo")

    println("\n----- COLECCIONES -----")
    println("Lista: $listaNumeros")
    println("Array: ${arrayNumeros.joinToString()}")
    println("Set: $setPalabras")
    println("Map: $mapaDatos")
    println("Array de Any: ${arrayCualquier.joinToString()}")

    println("\n----- OTROS TIPOS -----")
    println("Any type: $cualquierCosa")
    println("Lazy Value: $lazyValue")

    // Inicializamos la variable 'lateinit' antes de usarla
    LateInitHolder.noInicializado = "Inicializado después"
    println("Lateinit: ${LateInitHolder.noInicializado}")

    println("Suma (5 + 3): ${suma(5, 3)}")
    println("Constante: $CONSTANTE")
    println("Persona: ${persona.nombre} tiene ${persona.edad} años")
    println("Dirección: $direccion")

    when (resultado) {
        is Resultado.Exito -> println("Resultado: Éxito - ${resultado.mensaje}")
        is Resultado.Error -> println("Resultado: Error - ${resultado.error}")
    }

    println("\n----- FUNCIONES -----")
    hacerAlgo()
    // La siguiente línea está comentada porque lanza una excepción intencional:
    // lanzarExcepcion()
}
