// 8.1.4 
class Address(
    val city: String,
    val street: String,
    val house: String,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (city != other.city) return false
        if (street != other.street) return false
        if (house != other.house) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + house.hashCode()
        return result
    }
}

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

    println(address.indexOf(Address("Sydney", "NOrteh road", "129"))) // 2
    val addr1 = Address("London", "Lane", "8A")
    val addr2 = addr1
    val addr3 = Address("London", "Lane", "8A")

    println(addr1 === addr2) // t
    println(addr1 == addr2) // t
    println(addr1 === addr3) // f
    println(addr1 == addr3) // t
}
