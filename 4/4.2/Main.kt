fun sayHello(name: String?) {
    println("Hello, " + (name ?: "unKnown"))
}

fun main() {
    sayHello("john")
    sayHello(null)
}
