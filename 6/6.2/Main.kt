// data class는 toString() 구현도 생성해준다.
data class Person(val firstName: String, val familyName: String, val age: Int)

fun main() {
    val person = Person("john", "doe", 25)
    println(person) // Person(firstName=john, familyName=doe, age=25)

}
