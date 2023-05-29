import java.lang.IllegalArgumentException

class Person (var firstName: String, var familyName: String) {
    var fullName: String
        get(): String = "$firstName $familyName"
        set(value) {
            val names = value.split(" ")
            if (names.size != 2) {
                throw IllegalArgumentException("Invalid full name: $value")
            }
            firstName = names[0] 
            familyName = names[1]
        }
}
