
class Person(firstName: String, familyName: String) {
    val fullName = "$firstName $familyName"
    fun printFirstName() {
        println(firstName) // Error: not available 
        // 주생성자 파라미터를 property 초기화나 init 블록 밖에서 사용할 수 없다
    }
}
