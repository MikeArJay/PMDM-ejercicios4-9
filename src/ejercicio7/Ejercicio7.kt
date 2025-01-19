package ejercicio7

fun main() {

if (estaBalanceada("{ [ a * ( c + d ) ] - 5 }")){
    println("La exopresión está balanceada")
}else println("La expresión NO esta balanceada")

}
fun estaBalanceada(expresion:String):Boolean{
    val stack:MutableList<Char> = emptyList<Char>().toMutableList()
    for (char in expresion) {
        if (char in "({[") {
            stack.add(char)
            continue
        }
        if (char == ')') {
            if (stack.lastOrNull() != '(') return false
            else {
                stack.removeLast()
                continue
            }
        }
        if (char == '}') {
            if (stack.lastOrNull() != '{') return false
            else {
                stack.removeLast()
                continue
            }
        }
        if (char == ']') {
            if (stack.lastOrNull() != '[') return false
            else {
                stack.removeLast()
                continue
            }
        }
    }
    return stack.isEmpty()
}