fun main() {
    var name: String? = null
    fun init() {
        name = "John"
    }

    fun sayHello() {
        println(name!!.uppercase())
    }

    init()
    sayHello() // JOHN
}
