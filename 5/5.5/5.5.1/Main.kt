// 문맥이 없는 run

class Address(val city: String, val street: String, val house: String) {
    fun asText() = "$city, $street, $house"
}

fun main() {
    val address = Address("London", "Baker Street", "221b")
    println(address.asText())
}
