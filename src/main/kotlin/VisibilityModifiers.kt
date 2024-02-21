

fun main() {
    val myCircle1 = Circle(5.0)
    myCircle1.changeName("Peter") //error since fun changeName is private
    println("The new  name of the circle is ${myCircle1.name}")
    //var name is protected hence only accessible by the parent and child class(es)

    val myRect = Rectangle(3.0,8.0)
    println("Rectangle area is ${myRect.area()}")
    println("Rectangle perimeter is ${myRect.perimeter()}")
    println("Is Rectangle square? ${myRect.isSquare()}")
}
//private: only accessible in that class. Applies to variables too
//classes and objects are public by default
//protected: accessible within the class and all child classes only
//constructors can also be private or protected e.g. class Circle private/protected constructor(val...) {}