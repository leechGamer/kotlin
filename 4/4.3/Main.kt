class Person (val firstName: String, val familyName: String) {
    val fullName: String
        get(): String {
            return "$firstName $familyName"
        }

}
