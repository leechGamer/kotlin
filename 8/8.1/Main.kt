8.1.2 가상함수
open class Person(
    val name: String,
    val age: Int
) {
    open fun show() {
        println("$name $age")
    }

    init {
        show()
    }
}

class Student(
    name: String,
    age: Int,
    val university: String
): Person(name, age) {
    override fun show() {
        println("$name $age (student at $university)")
    }
}

fun main() {
    Student("euan", 25, "MIT")
    // euan 25 (student at null)

}
