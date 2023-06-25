// 8.1.2 데이터를 상위 클래스 생성자에게 전달해야 할 때

open class Person(val name: String, val age: Int)

class Student(name: String, age: Int, val university: String) : Person(name, age)

fun main() {
    Student("susan", 25, "MIT")
}
