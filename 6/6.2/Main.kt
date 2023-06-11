import kotlin.random.Random

// 구조 분해 선언

data class Person(val first: String, val family: String, val age: Int)

fun newPerson() = Person(readln()!!, readln()!!, Random.nextInt(100))

fun main() {
    val (first, family, age) = Person("name", "family" , 20)
    if (age < 18) {
        println("$first $family is under-age: $age")
    } else {
        println("$first $family is upper-age: $age")
    }
}
