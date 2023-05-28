class Person {
    val fullName: String

    constructor(firstName: String, familyName: String): // : (콜론)을 넣고 그 뒤에 일반 함수를 호출하는 거처럼 코드를 작성하되 함수 이름 대신 this를 사용하면 생성자 위임 호출이 된다 
            this("$firstName $familyName")
    constructor(fullName: String) {
        this.fullName = fullName
    }
}
