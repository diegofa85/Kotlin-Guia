fun main() {

    val day = Enum.WEDNESDAY
    println("Name: ${day.name}")        // Salida: Name: WEDNESDAY
    println("Ordinal: ${day.ordinal}")  // Salida: Ordinal: 2

    // Devuelve todos los enum
    val days = Enum.values()
    days.forEach { println(it) }

    val today = Enum.SATURDAY
    println(today.description()) // Salida: SATURDAY is a weekend.

    val message = when (day) {
        Enum.SATURDAY, Enum.SUNDAY -> "It's weekend!"
        else -> "It's a weekday."
    }
    println(message)

    println(Enum.MONDAY.isWeekend)
}