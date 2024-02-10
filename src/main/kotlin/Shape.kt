open class Shape(
    protected var name: String //protected only accessible within the class and all child classes. kt have no access either.
) {
    init {
        println("I am the super class!")
    }

    private fun changeName(newName: String) {
        //private fun is only accessible from its class. kt have no accesses either.
        name = newName

    }
}