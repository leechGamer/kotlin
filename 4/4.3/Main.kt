class Person (val firstName: String, val familyName: String) {
    val fullName: Any  
        get(): String { 
            // error: getter의 반환타입은 property타입 (Any) 와 같아야 한다.
            return "$firstName $familyName"
        }
}
