package ejercicio4    //  `Ejercicio 4`
    //Crea la clase ‘ejercicio4.Cuenta’ con los siguientes atributos:
    //
    //    Titular: obligatorio.
    //    Cantidad: opcional.
    //
    //Crea dos constructores que cumplan lo anterior.
    //
    //Tendrá dos métodos:
    //
    //    Ingresar: se ingresa una cantidad a la cuenta. Si la cantidad introducida es negativa, no se hará nada.
    //    Retirar: se retira una cantidad de la cuenta. Si la cantidad después de la retirada de efectivo es negativa,
    //    la cantidad de la cuenta pasa a ser 0.


class Cuenta(val titular:String, var cantidad:Float) {
    constructor (titular:String): this(titular, 0f)

    fun ingresar(ingreso: Float){
        if (ingreso > 0) cantidad += ingreso
    }
    fun retirar ( retirada:Float){
        cantidad -= retirada
        if(cantidad<0){
            cantidad = 0f
        }
    }
}