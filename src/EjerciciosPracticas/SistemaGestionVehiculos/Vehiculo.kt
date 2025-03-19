package EjerciciosPracticas.SistemaGestionVehiculos


interface Alquilable {
    fun alquilar(dias: Int): Double
}


open class Vehiculo(val marca: String, val modelo: String, val anio: Int, var precioPorDia: Double) : Alquilable {

    open fun calcularCosto(dias: Int): Double{
        return dias * precioPorDia
    }

    override fun alquilar(dias: Int): Double {
        return calcularCosto(dias)
    }

}

class Auto(marca: String,  modelo: String,  anio: Int,  precioPorDia: Double, val esAutomatico: Boolean ): Vehiculo(marca, modelo, anio, precioPorDia){
    override fun calcularCosto(dias: Int): Double {

        if (esAutomatico) {
            return super.calcularCosto(dias) * 1.10
        } else {
            return super.calcularCosto(dias)
        }
    }


}

class Moto(marca: String,  modelo: String,  anio: Int,  precioPorDia: Double, val cilindrada: Int ): Vehiculo(marca, modelo, anio, precioPorDia){
    override fun calcularCosto(dias: Int): Double {

        if (cilindrada>250) {
            return super.calcularCosto(dias) * 1.15
        } else {
            return super.calcularCosto(dias)
        }
    }
}