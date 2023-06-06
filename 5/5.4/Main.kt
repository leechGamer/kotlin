// 동반 객체가 존재하는 경우에만 동반 객체에 대한 확장을 정의할 수 있다
class Person(val firstName: String, val familyName: String) {
    companion object
}
val Person.Companion.UNKNOWN by lazy { Person("J", "D") }
