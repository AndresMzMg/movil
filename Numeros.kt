/*Bautista Rosales Alexis  */

fun main() {
    val numeros = mutableListOf("one", "two", "three", "four", "five", "four", "six")
    val numSet: Set<Int> = setOf(0, 1, 2, 3, 4, 5, 6)
    println("Numero de elementos: ${numeros.size}")
    println("Segundo elemento: ${numeros[1]}")
    println("Cuarto elemento: ${numeros[3]}")
    println("Ultimo elemento:  ${numeros[numeros.size - 1]}")
    println("Index del elemento \"four\":  ${numeros.indexOf("four")}")
}
