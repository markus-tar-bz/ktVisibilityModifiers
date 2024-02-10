import kotlin.math.PI

class Circle(
    private val radius: Double
) : Shape("Circle") {
    init {
        println("$name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimetetr is ${perimeter()}")

    }

    private fun area() = radius * radius * PI
    private fun perimeter() = 2 * PI * radius

}