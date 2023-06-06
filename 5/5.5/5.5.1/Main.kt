// 문맥 없는 run
// run 을 오버로딩
// 문맥 식이 없고 람다 값을 반환하기만 함
class Address (
    var zipCode: Int =0,
    var city: String = "",
    var street: String = "",
    var house: String = "",
) {
    fun post(message: String): Boolean {
        "Message for {$zipCode, $city, $street, $house} : $message"

        return readln() == "OK"
    }

    fun asText() = "$city $street $house"
}

fun main() {
    val addr = Address(
        zipCode = 123,
        city = "seoul",
        street = "baker st",
        house = "221bn"
    )
    println(addr.asText())
}
