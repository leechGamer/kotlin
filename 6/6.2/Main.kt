import kotlin.random.Random

data class Person(val first: String, val family: String, val age: Int)

fun newPerson() = Person(readln()!!, readln()!!, Random.nextInt(100))

fun main() {
    val person = newPerson()
    val first = person.first
    val family = person.family
    val age = person.age

    if (age < 18) {
        println("$first $family is under-age")
    }
}
