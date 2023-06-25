// 8.1.2 this 누출 
// 상위 클래스가 현재의 인스턴스를 코드에 누출하는데,
// 현재 인스턴스는 아직 초기화되지 않은 인스턴스의 상태에 의존할 수 있기 때문이다. 
open class Person(
    val name: String,
    val age: Int
) {
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
    init {
        println(this) // 잠재적인 위험요소
    }
}

class Student(
    name: String,
    age: Int,
    val university: String
): Person(name, age) {
    override fun toString(): String {
        return super.toString() + "(student at $university)"
    }
}

fun main() {
    Student("euan", 25, "MIT")
    // Person(name='euan', age=25)(student at null)
}
