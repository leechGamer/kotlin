// 주생성자의 파라미터에서 선어한 프로퍼티만 equals() / hashCod()/ toString() 메서드 구현에 쓰인다.
// 다른 프로퍼티들은 이런 함수들의 생성에 영향을 미치지 못한다.
data class Person(val firstName: String, val familyName: String) {
    var age = 0
}

fun main() {
    val person = Person("john", "doe").apply { age = 25 }
    val person2 = Person("john", "doe").apply { age = 26 }
    println(person == person2) // Person(firstName=john, familyName=doe, age=25)

}
