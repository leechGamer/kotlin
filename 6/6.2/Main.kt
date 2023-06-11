// class -> data class 컴파일러가 주생성자에 정의된 
// 프로퍼티의 값을 서로 비교하는 동등성 비교 연산을 자동으로 생성해주기 때문에 두 비교가 true가 된다.
data class Person(val firstName: String, val familyName: String, val age: Int)

fun main() {
    val person1 = Person("jo", "doe", 25)
    val person2 = Person("jo", "doe", 25)
    val person3 = person1

    println(person1 == person2) // true
    println(person1 == person3) // true
}
