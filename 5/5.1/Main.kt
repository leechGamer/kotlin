// 비공개 코드가 외부로 노출되는 일을 방지하기 위해 코틀린은 인라인 함수에 비공개 멤버를 전달하는 것을 금지한다.
class Person (
private val firstName: String,
private val familyName: String,
){
    inline fun secondMessage(message: () -> String) {
        println("$firstName $familyName: ${message()}") // ublic-API inline function cannot access non-public-API 'private final val firstName: String defined in Person
    }
}
