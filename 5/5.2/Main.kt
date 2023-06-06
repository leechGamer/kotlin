// 클래스 멤버와 확장의 시그니처가 같다면?
// 호출 지점에서 어떤 함수를 호출할지 모호할 때 컴파일러는 항상 멤버 함수를 우선적으로 선택한다. 
class Person(val firstName: String, val familyName: String) {
     fun fullName() = "$firstName $familyName"
}

fun Person.fullName() = "$firstName $familyName"

fun main() {
    println(Person("John", "Doe").fullName())
}
