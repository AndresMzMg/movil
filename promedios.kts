fun main() {
    // Solicita las medidas de los lados del triángulo al usuario
    println("Ingrese la longitud del primer lado: ")
    val lado1 = readLine()!!.toDouble()

    println("Ingrese la longitud del segundo lado: ")
    val lado2 = readLine()!!.toDouble()

    println("Ingrese la longitud del tercer lado: ")
    val lado3 = readLine()!!.toDouble()

    // Verifica el tipo de triángulo
    val tipoTriangulo = determinarTipoTriangulo(lado1, lado2, lado3)

    // Imprime el resultado
    when (tipoTriangulo) {
        "Equilátero" -> println("El triángulo es equilátero.")
        "Isósceles" -> println("El triángulo es isósceles.")
        "Escaleno" -> println("El triángulo es escaleno.")
        else -> println("Las medidas ingresadas no forman un triángulo válido.")
    }
}

fun determinarTipoTriangulo(lado1: Double, lado2: Double, lado3: Double): String {
    if (lado1 == lado2 && lado2 == lado3) {
        return "Equilátero"
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        return "Isósceles"
    } else {
        return "Escaleno"
    }
}