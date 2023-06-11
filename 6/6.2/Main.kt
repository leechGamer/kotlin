// 구조 분해 선언

data class Person(val first: String, val family: String, val age: Int)


fun main() {
    val (name) = Person("john", "doe", 25)
    println(name)

    val (_, family) = Person("john", "doe", 25)
    println(family)

    var (firstName, familyName) = Person("JOHN", "DOE", 25)
    firstName = firstName.lowercase()
    familyName = familyName.lowercase()
    println("$firstName $familyName") // john doe
}

