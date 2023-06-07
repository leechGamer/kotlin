// also : 인자가 하나 있는 람다를 파라미터로 받는다
class Address {
    var city: String = ""
    var street: String = ""
    var house: String = ""

    fun post(message: String) {}
}

fun main() {
    val  message = readLine() ?: return
    
    Address().also {
        it.city = "London"
        it.street = "Baker Street"
        it.house = "221b"
    }.post(message)
}
