class Person(firstName: String, familyName: String) {
    var fullName = "$firstName $familyName"

    init {
        println("created new Person instance: $fullName")
    }
}

fun main() {
    val person = Person("john", "doe")
    val person2 = Person("ann", "caporicci")
    val person3 = Person("hassan", "abid")
}
