// 8.1.2 부모 클래스의 부생성자 이용하기
open class Person (val name: String, val age: Int)

class Student: Person {
    private val university: String
    constructor(name: String, age: Int, university: String) :
            super(name, age) {
        this.university = university
    }
}
