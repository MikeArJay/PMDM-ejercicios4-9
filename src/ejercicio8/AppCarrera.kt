package ejercicio8

fun main() {
println(carrera(arrayOf("correr", "saltar", "correr", "saltar", "correr"), "_|_|_"))
    println(carrera(arrayOf("correr", "correr", "correr", "saltar", "correr"), "_|_|_"))
    println(carrera(arrayOf("correr", "correr", "saltar", "saltar", "correr"), "_|_|_"))
    println(carrera(arrayOf("correr", "correr", "saltar", "saltar", "correr"), "_|_|_|_"))
    println(carrera(arrayOf("correr", "saltar", "correr", "saltar"), "_|_|_"))
    println(carrera(arrayOf("correr", "saltar", "correr", "saltar", "correr", "saltar", "correr"), "_|_|_"))
    println(carrera(arrayOf("saltar", "saltar", "saltar", "saltar", "saltar"), "|||||"))
    println(carrera(arrayOf("saltar", "saltar", "saltar", "saltar", "saltar"), "||_||"))


}

fun carrera(acciones:Array<String>, pista:String):Boolean{
    val check:Map<String, Char> = mapOf("correr" to '_', "saltar" to '|')
    var toPrint = ""
    // para evitar out of bout exception y poder imprimir correctamente el resiltado:
    val lengthLongest:Int = if(acciones.size > pista.length) acciones.size else pista.length
    val lengthShortest:Int = if(acciones.size < pista.length) acciones.size else pista.length
    // recorremos hasta el final del más corto, si son iguales recorreremos ambos hasta el final.
    for( i in 0..< lengthShortest) {
        toPrint += if (check.getValue(acciones[i]) != pista[i]) {
            if (acciones[i] == "saltar" && pista[i] == '_') 'x'
            else if (acciones[i] == "correr" && pista[i] == '|') '/'
            else '?' // si se cuela algún simbolo incorrecto
        } else pista[i]
    }
    if(lengthShortest != lengthLongest) toPrint += "?".repeat(lengthLongest-lengthShortest)
    println(toPrint)
    return (toPrint==pista)
}
