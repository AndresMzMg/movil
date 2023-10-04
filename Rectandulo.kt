/*AREA DEL RECTANGULO*/
/*Bautista Rosales Alexis Axel */
fun main() {

    val largo = 18.0
    val ancho = 6.0
    val altura = 12.0

    val areaRec = calcularArea(largo, ancho)
    println("El área del rectángulo es: $areaRec")

    val volumen = calcularVolumen(areaRec, altura)
    println("El volumen del prisma rectangular es: $volumen")
}

fun calcularArea(largo: Double, ancho: Double): Double {
    return largo * ancho
}

fun calcularVolumen(areaRec: Double, altura: Double): Double {
    return areaRec * altura
}
