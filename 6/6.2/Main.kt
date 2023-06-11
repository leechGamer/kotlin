// 자바와 마찬가지로 타입의 값은 기본적으로 참조가 가리키는 객체의 identity가 같으면 같다. (즉, 메모리에서의 주소값이 같으면 같다)
class Person(val firstName: String, val familyName: String, val age: Int)

fun main() {
    val person1 = Person("jo", "doe", 25)
    val person2 = Person("jo", "doe", 25)
    val person3 = person1

    println(person1 == person2) // false
    println(person1 == person3) // true
}
