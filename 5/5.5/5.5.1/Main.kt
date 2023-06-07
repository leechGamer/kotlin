// let 함수
class Address(val city: String, val street: String, val house: String) {
    fun post(message: String) {}
}
fun main() {
    Address("London", "Baker Street", "221b").let {
        println("To city: ${it.city}")
        it.post("Hello")
    }
    
     Address("London", "Baker Street", "221b").let { addr -> 
        println("To city: ${it.city}")
        it.post("Hello")
    }
}
