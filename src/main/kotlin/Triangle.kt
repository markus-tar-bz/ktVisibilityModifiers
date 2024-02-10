import kotlin.math.sqrt

class Triangle(
    private val a: Double,
    private val b: Double,
    private val c: Double
) : Shape("Triangle") {
    init {
        println("$name created with a = $a and b = $b")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")

    }

    private fun perimeter() = a + b + c
    private fun area() = sqrt((perimeter() / 2) * ((perimeter() / 2) - a) * ((perimeter() / 2) - b) * ((perimeter() / 2) - c))
}