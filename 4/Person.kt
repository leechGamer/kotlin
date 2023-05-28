class Person (val id: Id, val age: Int) {
    class Id (val firstName: String, val familyName: String)
    fun showMe() = println("${id.firstName} ${id.familyName}, $age")
}

fun main() {
    val id = Person.Id("john", "caporicci")
    val person = Person(id, 25)
    person.showMe() // john caporicci, 25
}
