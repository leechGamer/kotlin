// 상위 클래스가 여러 생성자를 제공하고 하위 클래스에서 상위 클래스의 생성자 중 둘 이상을 지원하고 싶을때

open class Person {
    val name: String
    val age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor(firstName: String, familyName: String, age: Int) :
            this("$firstName $familyName", age) {
    }
}

class Student: Person {
    val university: String
    constructor(name: String, age: Int, university: String) :
            super(name, age) {
        this.university = university
    }

    constructor(firstName: String, familyName: String, age: Int, university: String) :
            super(firstName, familyName, age) {
        this.university = university
    }
}

fun main() {
    Student("susan", 25, "MIT")
}
