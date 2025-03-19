package EjerciciosPracticas.SistemaGestionVehiculos

class Cliente(val nombre: String, val edad: Int) {
    val historialAlquileres: MutableList<Vehiculo> = mutableListOf()

    fun alquilarVehiculo(vehiculo: Vehiculo, dias: Int) {
        val costoTotal = vehiculo.alquilar(dias)
        historialAlquileres.add(vehiculo)
        println("Vehículo alquilado con éxito.")
        println("Resumen del alquiler:")
        println("Cliente: $nombre")
        println("Vehículo: ${vehiculo.marca} ${vehiculo.modelo} - Año: ${vehiculo.anio}")
        println("Costo total: $$costoTotal")
    }

    fun mostrarHistorial() {
        if (historialAlquileres.isEmpty()) {
            println("$nombre no ha alquilado ningún vehículo aún.")
        } else {
            println("Historial de alquileres de $nombre:")
            historialAlquileres.forEachIndexed { index, vehiculo ->
                println("${index + 1}. ${vehiculo.marca} ${vehiculo.modelo} - Año: ${vehiculo.anio}")
            }
        }
    }
}
