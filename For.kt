/*Bautista Rosales Alexis Axel */
fun main() {
    val nombres = listOf(
        "Gabriela",
        "Noble 6",
        "Kiara",
        "Elena",
        "Luna",
        "Lucero",
        "Lupita",
        "Juan",
        "Axel"
    )
    for (nombre in nombres) {
        println(nombre)
        if (nombre == "Noble 6") {
            println("Personaje Encontrado!")
            break
        }
    }
}
