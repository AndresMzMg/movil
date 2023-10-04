import kotlin.math.round

fun CalcularPromedio(calif1: Int = 8, calif2: Int = 8, calif3: Int): Double {
    val promedio = (calif1 + calif2 + calif3) / 3.0
    return promedio
}

fun main() {
    println("Ingrese la tercera calificación:")
    val calif3 = readLine()?.toInt() ?: 0

    val promedio = CalcularPromedio(calif3 = calif3)
    println("El promedio de las calificaciones es: $promedio")
}
