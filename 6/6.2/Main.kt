import kotlin.random.Random

// 구조 분해 선언

data class Person(val first: String, val family: String, val age: Int)

fun newPerson() = Person(readln()!!, readln()!!, Random.nextInt(100))

fun main() {
    val person = newPerson()
    val (first, family, age) = person // 구조분해 선언
    if (age < 18) {
        println("$first $family is under-age")
    }
}
