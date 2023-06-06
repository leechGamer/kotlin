// with
// run 과 비슷하지만 확장함수 타입이 아니므로 수신객체를 첫번째 인자로 넘겨야한다.
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
}

fun main() {
    val message = with(Address(
        zipCode = 123,
        city = "seoul",
        street = "baker st",
        house = "221bn"
    )) {
        "Address : $city"
    }

    println(message)
}
