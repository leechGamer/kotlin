class Person (val firstName: String, val familyName: String) {
    // 코틀린 1.1 부터는 property와 getter 정의에서 property타입을 생략하고 타입추론에 의존하면 된다.
    val fullName
        get() = "$firstName $familyName"
}
