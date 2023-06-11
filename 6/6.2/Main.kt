// deep equality가 이뤄지는지 여부는 프로퍼티의 타입으로 어떤 타입이 들어있으냐에 따라 다르다.
data class Person(val firstName: String, val familyName: String, val age: Int)

data class Mailbox(val address: String, val person: Person)
fun main() {
    val b1 = Mailbox("unknown", Person("john", "doe", 25))
    val b2 = Mailbox("unknown", Person("john", "doe", 25))
    println(b1 == b2) // true
}
