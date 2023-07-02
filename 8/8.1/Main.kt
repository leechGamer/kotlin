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

    override fun toString(): String {
        return "Address(city='$city', street='$street', house='$house')"
    }
}

open class Entity(
    val name: String,
    val address: Address

) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Entity

        if (name != other.name) return false
        if (address != other.address) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + address.hashCode()
        return result
    }

    override fun toString(): String {
        return "Entity(name='$name', address=$address)"
    }
}
// 8.1.4 커스텀 동등성 연산
class Person(
    name: String,
    address: Address,
    val age: Int,
): Entity(name, address) {
    override fun toString(): String {
        return "Person(age=$age)"
    }
}

class Organization(
    name: String,
    address: Address,
    val manager: Person?
): Entity(name, address) {
    override fun toString(): String {
        return "Organization(manager=$manager)"
    }
}

fun main() {
    val address = arrayOf(
        Address("London", "Lane", "8A"),
        Address("New", "west", "11/B"),
        Address("Sydney", "NOrteh road", "129"),
    )

    println(Person("euan", Address("London", "Lane", "8A"), 25))
    println(Organization(
        "thriftoc",
        Address("London", "Lane", "8A"),
        null)
    )
}
