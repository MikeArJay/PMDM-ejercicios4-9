package ejercicio5

class Almacen {
    private val estanteria: Array<Array<Bebida?>> = Array(5) { arrayOfNulls(5) }


    fun comprobarNoDuplicado(id: Int): Boolean {
        for (estante in estanteria) {
            for (item in estante) {
                if (item?.id == id) return false // item? se asegura de que no es null antes de comparar.
            }
        }
        return true
    }


    fun agregarBebida(bebida: Bebida): Boolean {
        if (comprobarNoDuplicado(bebida.id)) {
            for (estante in estanteria) {
                for (i in estante.indices) {
                    if (estante[i] == null) {
                        estante[i] = bebida
                        println("Bebida añadida")
                        return true
                    }
                }
            }
            println("El almacen está lleno")
            return false

        }
        println("La bebida ya está en el almacén")
        return false


    }

    fun eliminarBebida(id: Int): Boolean {
        for (estante in estanteria) {
            for (i in estante.indices) {
                if (estante[i]?.id == id) {
                    estante[i] = null
                    println("Bebida con id $id ha sido eliminada")
                    return true
                }
            }
        }
        println("La bebida no está en el almacén")
        return false
    }

    fun mostrarBebida() {
        for (estante in estanteria) {
            for (bebida in estante) {
                if (bebida != null) {
                    println(bebida.toString())
                }
            }
        }
    }

    fun calcularPrecio(): Double {
        var precioTotal = 0.0
        for (estante in estanteria) {
            for (bebida in estante) {
                if (bebida != null) {
                    precioTotal += bebida.precio
                }
            }
        }
        return precioTotal
    }

    fun calcularPrecio(marca: String): Double {
        var precioTotal = 0.0
        for (estante in estanteria) {
            for (bebida in estante) {
                if (bebida != null && bebida.marca == marca) {
                    precioTotal += bebida.precio
                }
            }
        }
        return precioTotal
    }

    fun calcularPrecio(columna: Int): Double {
        return if(columna in estanteria[0].indices) {
            estanteria.sumOf { it[columna]?.precio ?:0.0 }
        }else {
            -1.0
        }
    }
}