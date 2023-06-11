// 모든 데이터 클래스는 암시적으로 copy() 함수를 제공한다.
data class Person(val firstName: String, val familyName: String, val age: Int)

fun Person.show() = println("$firstName $familyName: $age")
fun main() {
    val person = Person("j", "doe", 25)

    person.show()
    person.copy(familyName = "smith").show()
    person.copy(age = 30, firstName = "jane").show()
}
