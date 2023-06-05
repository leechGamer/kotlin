class Person (
    val firstName: String,
    val familyName: String,
){
    inline var fullName
        get() = "$firstName $familyName"
        set(value) {}
}
