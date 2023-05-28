class Person {
    var firstName: String = ""
    var familyName: String = ""
    var age : Int = 0

    fun fullName() = "$firstName $familyName"
    fun showMe() {
        println("${fullName()} : $age")
    }
    fun readAge() {
        this.age = readLine()!!.toInt()
    }
}

fun main() {
    val person = Person()

    person.firstName = "john"
    person.familyName = "doe"
    person.age = 25

    person.showMe() // john doe : 25
}
