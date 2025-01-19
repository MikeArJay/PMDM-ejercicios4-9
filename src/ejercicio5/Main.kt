package ejercicio5


fun main() {
    val agua = AguaMineral(1, 0.5, 1.0, "Bezolla", "Fuente")
    val almacen = Almacen()

    almacen.agregarBebida(agua)
    almacen.eliminarBebida(1)
    println( agua.toString())
    val bebidaAzucarada = BebidaAzucarada(2, 0.33, 1.3, "Cocacola", 99,  true)
    almacen.agregarBebida(bebidaAzucarada)
    for(id in 1..5){
        almacen.agregarBebida(AguaMineral(id, 0.5, 1.0, "Bezolla", "Fuente"))
    }
    almacen.mostrarBebida()
    println(almacen.calcularPrecio())
    println(almacen.calcularPrecio(1))
    println(almacen.calcularPrecio("Cocacola"))




}
