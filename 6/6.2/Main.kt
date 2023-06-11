data class Person(
    val family: String,
    val name: String,
    val age: Int,
)

fun combine(
    person1: Person,
    person2: Person,
    folder: ((String, Person) -> String)): String
{
    return  folder(folder("", person1), person2)
}

fun main() {
    // for 루프에서 구조 분해
    val pairs = arrayOf(1 to "one", 2 to "two", 3 to "three")

    for ((number, name) in pairs) {
        println("$number: $name")
    }
    println("=====")
    val p1 = Person("joh", "doe", 25)
    val p2 = Person("joh", "doe", 26)

    // 구조 분해를 쓰지 않음
    println(combine(p1, p2) {text, person -> "$text ${person.age}"})

    // 구조 분해를 씀
    println(combine(p1, p2) { text, (first)-> "$text $first"})
    println(combine(p1, p2) { text, (_, family) -> "$text $family"})
}

