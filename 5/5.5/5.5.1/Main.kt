// apply 함수 : 반환값을 만들어내지 않고 객체 상태를 설정
class Address {
    var city: String = ""
    var street: String = ""
    var house: String = ""

    fun post(message: String) {}
}

fun main() {
    val  message = readLine()?: return
    Address().apply {
        city = "London"
        street = "Baker Street"
        house = "221b"
    }.post(message)
}
