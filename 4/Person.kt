
class Person(val firstName: String, familyName: String) {
        val fullName = "$firstName $familyName"
        fun printFirstName() {
            println(firstName)
        }
    }
