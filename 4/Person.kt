
class Person(firstName: String, familyName: String) {
    val firstName = firstName // 주생성자 파라미터를 초기화나 init 밖에서 사용하려면, 생성자 파라미터 값을 저장할 property를 정의하자
    val fullName = "$firstName $familyName"
    fun printFirstName() {
        println(firstName)
    }
}
