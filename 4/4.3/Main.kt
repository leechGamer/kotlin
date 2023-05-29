class Person (val firstName: String, val familyName: String, age: Int) {
    val age: Int = age
        get(): Int {
            println("Accessing age")
            return field
        }
}

fun main() {
    val p = Person("first", "second", 1)
    p.age
}
