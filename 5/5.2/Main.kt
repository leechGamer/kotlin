// binding 된 호출 가능 참조 위치에 사용할 수도 있다
class Person(val name: String, val age: Int)

fun Person.hasName(name: String) = name.equals(this.name, ignoreCase = true)

fun main() {
    val f = Person("John", 25)::hasName //
    println(f("John"))
    println(f("Jake"))
}
