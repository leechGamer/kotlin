class Person (val fullName: String) {
    constructor(firstName: String, familyName: String):
            this("$firstName $familyName")
}

