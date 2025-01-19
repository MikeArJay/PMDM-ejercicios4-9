package ejercicio5

import kotlin.reflect.KProperty

// clase base bebidas
open class Bebida(
    val id: Int,
    val litros: Double,
    open val precio: Double,
    val marca: String
){
    override fun toString(): String {
        return "id: $id, Litros: $litros, Precio: $precio, Marca: $marca"
    }
}

// clase derivada para agua mineral
class AguaMineral(
    id: Int,
    litros: Double,
    precio: Double,
    marca: String,
    val origen: String
) : Bebida(id, litros, precio, marca){
    override fun toString(): String {
        return super.toString() + " Origen: $origen"
    }
}

// clase derivada para bebidas azucaradas
class BebidaAzucarada(
    id: Int,
    litros: Double,
    precio: Double,
    marca: String,
    val porcentajeAzucar: Int,
    val descuento: Boolean
): Bebida(id, litros, precio, marca){
    override val precio: Double
        get() = if(descuento) super.precio * 0.9 else super.precio;

    override fun toString(): String {
        return super.toString() + " Porcentaje de azucar: $porcentajeAzucar; Descuento: $descuento"
    }
}