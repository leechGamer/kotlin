// 8.1.2 클래스에 주생성자가 있으면 부생성자가 상위 클래스를 위임 호출할 수 없다
open class Person (val name: String, val age: Int)

class Student(): Person { // error: This type has a constructor, and thus must be initialized here
    private val university: String
    constructor(name: String, age: Int, university: String) :
            super(name, age) { // error: Primary constructor call expected
        this.university = university
    }
}

fun main() {
    Student("susan", 25, "MIT")
}
