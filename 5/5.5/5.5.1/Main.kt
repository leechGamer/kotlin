// run
// 객체 상태를 설정한 다음 객체를 대상으로 어떤 결과를 만들어 내느 람다를 호출

class Address {
    var zipCode: Int =0
    var city: String = ""
    var street: String = ""
    var house: String = ""

    fun post(message: String): Boolean {
        "Message for {$zipCode, $city, $street, $house} : $message"

        return readln() == "OK"
    }
}

fun main() {
    val isReceived = Address().run {
    // addr 인스턴스를 this로 사용할 수 있음
        zipCode = 123
        city = "seoul"
        street = "baker st"
        house = "221bn"
        post("hello !!")
    }

    if (!isReceived) {
        println("Message is nto delivered")
    }
}
