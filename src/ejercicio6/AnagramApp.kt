package ejercicio6

import java.util.Scanner

fun main(){
    var palabra1:String
    var palabra2:String

    // inicializar Scanner
    val scanner = Scanner(System.`in`)
    var continuar = true
    while(continuar) {
        println("Introduce la primera palabra")
        palabra1 = scanner.nextLine()
        println("Introduce la segunda palabra")
        palabra2 = scanner.nextLine()
        if (sonAnagrama(palabra1, palabra2)) println("Las palabras son anagramas")
        else println("Las palabras no son anagramas")
        println("introduce q para salir, cualquier otra tecla para continuar")
        continuar= scanner.nextLine() != "q"
    }


}

fun sonAnagrama(palabra1:String, palabra2:String):Boolean{
    val lowercase1 = palabra1.lowercase()
    val lowercase2 = palabra2.lowercase()
    if(lowercase1==lowercase2 || palabra1.length != palabra2.length) return false
    val sorted1:List<Char> = lowercase1.toList().sorted()
    val sorted2 = lowercase2.toList().sorted()
    return sorted1==sorted2

}