// 8.1.3 가변 변수일 때 검사하는 시점과 변수를 읽는 시점 사이에 값을 명시적으로 변경하거나 어떤 람다 안에서 변수를 변경하면 스마트캐스트 되지 않는다
fun main() {
    var o: Any = 123
    if (o is Int) {
        println(o + 1) // Ok: Int로 스마트 캐스트
        o = ""
        println(o.length) // Ok: String으로 스마트 캐스트
    }
    if (o is String) {
        val f = {o = 123}
        println(o.length) // error: smart cast 불가 
        // Smart cast to 'String' is impossible, because 'o' is a local variable that is captured by a changing closure
    }
}
