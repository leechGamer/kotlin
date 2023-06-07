// apply 함수 : 반환값을 만들어내지 않고 객체 상태를 설정
class Address {
    var city: String = ""
    var street: String = ""
    var house: String = ""
}

class Person(val firstName: String, val familyName: String) {
    fun Address.post(message: String) {
        // 암시적 this: 확장 수신 객체 (Address)
        val city = city

        // 한정시키지 않은 this: 확장 수신 객체 (Address)
        val street = this.city

        // 한정시킨 this: 확장 수신 객체()
        val house = this@post.house

        // 암시적 this: 디스패치 수신 객체
        val firstName = firstName

        // 한정 this: 디스패치 수신 객체
        val familyName = this@Person.familyName

        println("$firstName, $familyName, $city")
        println(message)
    }

    fun test(address: Address) {
        // dispatch receiver : 암시적
        // extend receiver : 명시적
        address.post("Hello")
    }
}


fun main() {
    val  message = readLine() ?: return
}



