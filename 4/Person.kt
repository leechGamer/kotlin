import java.lang.IllegalArgumentException

class Person(fullName: String) {
    val firstName: String
    val familyName: String

    init {
        val names = fullName.split(" ")
        if (names.size != 2) {
            throw IllegalArgumentException("Invalid name: $fullName")
        }
        firstName = names[0]
        familyName = names[1]
    }
}

fun main() {
    val person = Person("John Doe")
    println(person.firstName) // John
}
