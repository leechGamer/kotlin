// 8.1.3 커스텀 동등성 연산
// 프로퍼티는 같지만 두 인스턴스가 같은 객체로 간주되지 않는다.
class Address(
    val city: String,
    val street: String,
    val house: String,
)

open class Entity(
    val name: String,
    val address: Address
)

class Person(
    name: String,
    address: Address,
    val age: Int,
): Entity(name, address)

class Organization(
    name: String,
    address: Address,
    val manager: Person
): Entity(name, address)

fun main() {
    val address = arrayOf(
        Address("London", "Lane", "8A"),
        Address("New", "west", "11/B"),
        Address("Sydney", "NOrteh road", "129"),
    )

    println(address.indexOf(Address("Sydney", "NOrteh road", "129"))) // -1
}
