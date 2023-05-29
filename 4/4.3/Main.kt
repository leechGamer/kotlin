import java.lang.IllegalArgumentException

class Person (val firstName: String, val familyName: String) {
    var age: Int? = null
        set(value) {
            if (value != null && value <= 0) {
                throw IllegalArgumentException("Invalid age: $value")
            }
            field = value
        }
}

fun main() {
    val p = Person("first", "second")
    p.age = 20
    println(p.age)
}
