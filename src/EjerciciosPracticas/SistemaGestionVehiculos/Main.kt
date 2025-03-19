package EjerciciosPracticas.SistemaGestionVehiculos

fun main() {
    val auto1 = Auto("Toyota", "Corolla", 2022, 50.0, true)
    val auto2 = Auto("Ford", "Fiesta", 2021, 50.0, false)
    val moto1 = Moto("Yamaha", "R3", 2023, 30.0, 300)
    val moto2 = Moto("Honda", "CBR", 2020, 30.0, 200)


    val cliente = Cliente("Pepe",77, )
    val  diasAlquiler: Int = 10

    cliente.alquilarVehiculo(auto1,diasAlquiler)
    println()
    cliente.alquilarVehiculo(auto2,diasAlquiler)
    println()
    cliente.alquilarVehiculo(moto1,diasAlquiler)
    println()
    cliente.alquilarVehiculo(moto2,diasAlquiler)
    println()


    cliente.mostrarHistorial()


}