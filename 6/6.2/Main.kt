// String, Person MailBox 는 모두 내용을 바탕으로 동등성을 구현하기 때문에
// MailBox 인스턴스 비교는 address비교와 Person에 있는 클래스의 동등성 비교에 따라 변경
// data 변경자를 없애면 Person 프로퍼티 비교가 객체의 정체성에 따라 결정되기 때문에 결과가 바뀐다.
class Person(val firstName: String, val familyName: String, val age: Int)

data class Mailbox(val address: String, val person: Person)
fun main() {
    val b1 = Mailbox("unknown", Person("john", "doe", 25))
    val b2 = Mailbox("unknown", Person("john", "doe", 25))
    println(b1 == b2) // false :: person이 서로 다르기 때문
}
