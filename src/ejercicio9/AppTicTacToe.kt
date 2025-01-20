package ejercicio9

fun main() {
    val tablero1= arrayOf(arrayOf("X", "O", "X"), arrayOf("O", "X", "O"), arrayOf("O", "O", "X"))
    val tablero2= arrayOf(arrayOf("", "O", "X"), arrayOf("", "X", "O"), arrayOf("", "O", "X"))
    val tablero3= arrayOf(arrayOf("O", "O", "O"), arrayOf("O", "X", "X"), arrayOf("O", "X", "X"))
    val tablero4= arrayOf(arrayOf("X", "O", "X"), arrayOf("X", "X", "O"), arrayOf("X", "X", "X"))
    println(comprobarGanador(tablero1))
    println(comprobarGanador(tablero2))
    println(comprobarGanador(tablero3))
    println(comprobarGanador(tablero4))

}

class Index(val row: Int, val column: Int)


fun comprobarGanador(tablero: Array<Array<String>>): String? {

    // comprobacion tablero válido
    var countX = 0
    var countO = 0
    var emptyCount = 0

    if (tablero.size != 3 || tablero[0].size != 3 || tablero[1].size != 3 || tablero[2].size != 3) return null

    tablero.forEach { fila ->
        fila.forEach { posicion ->
            when (posicion.uppercase()) {
                "X" -> countX += 1
                "O" -> countO += 1
                "" -> emptyCount += 1
                else -> return null // simbolo no contemplado
            }
        }
    }
    if(countX - countO !in -1..1) return null // solo puede haber una diferencia de una jugada

    // comprobar ganador
    var winnerX = false
    var winnerO = false

    val combinacionesGanadoras = arrayOf(
        //horizontal
        arrayOf(Index(0, 0), Index(1, 0), Index(2, 0)),
        arrayOf(Index(0, 1), Index(1, 1), Index(2, 1)),
        arrayOf(Index(0, 2), Index(1, 2), Index(2, 2)),
        //vertical
        arrayOf(Index(0, 0), Index(0, 1), Index(0, 2)),
        arrayOf(Index(1, 0), Index(1, 1), Index(1, 2)),
        arrayOf(Index(2, 0), Index(2, 1), Index(2, 2)),
        // diagonal
        arrayOf(Index(0, 0), Index(1, 1), Index(2, 2)),
        arrayOf(Index(2, 0), Index(1, 1), Index(0, 2))
    )
    combinacionesGanadoras.forEach { combinacion ->
        // comprobación de x
        if (comprobarCombinacion("X", combinacion, tablero)) winnerX = true
        // comprobación de o
        if (comprobarCombinacion("O", combinacion, tablero)) winnerO = true
    }
    return if (winnerX && winnerO) null
    else if (winnerX) "X"
    else if (winnerO) "O"
    else if (emptyCount == 0) "Empate"
    else null
}

fun comprobarCombinacion(xo: String, combinacion: Array<Index>, tablero: Array<Array<String>>): Boolean {
    for (index in combinacion) {
        if (tablero[index.row][index.column].uppercase() != xo) return false
    }
    return true
}