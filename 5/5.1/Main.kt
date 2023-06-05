class Person (
    val firstName: String,
    val familyName: String,
){
    var fullName
        inline get() = "$firstName $familyName"
        set(value) {}
}
