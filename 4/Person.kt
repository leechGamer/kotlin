class Person (private val id: Id, private val age: Int) {
    class Id (private val firstName: String, private val familyName: String) {
        fun nameSake(person: Person) = person.id.firstName == firstName
    }
    fun showMe() = println("${id.firstName} ${id.familyName}, $age") // error: 바깥쪽 class는 nested class의 private 멤버에 접근 불가
}
