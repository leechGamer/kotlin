// property가 public인 경우 getter / setter안에서 비공개 선언을 참조하면 인라인이 불가능하다
class Person (
    private val firstName: String,
    private val familyName: String,
){
    inline var age = 0 // Error: initializer is not allowed here because this property has no backing field
    inline val fullName get() = "$firstName $familyName" // Error: Public-API inline function cannot access non-public-API 'private final val familyName: String defined in Person'
}
