class Person(firstName: String, familyName: String) {
    var fullName = "$firstName $familyName"

    init {
        if (firstName.isEmpty() && familyName.isEmpty()) return  // 초기화 블록에서는 return 을 허용하지 않는다.
        println("created new Person instance: $fullName")
    }
}

fun main() {
    val person = Person("john", "doe")
    val person2 = Person("ann", "caporicci")
    val person3 = Person("hassan", "abid")
}
