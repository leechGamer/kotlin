// 8.1.3 프로퍼티나 커스텀 접근자가 정의된 변수에 대해서는 스마트 캐스트를 쓸 수 없다
class Holder {
    val o: Any get() = ""
}

fun main() {
    val o: Any by lazy { 123 }

    if (o is Int) {
        println(o*2) //error: Smart cast to 'Int' is impossible, because 'o' is a property that has open or custom getter
    }

    val holder = Holder()

    if (holder.o is String) {
        println(holder.o.length) // error: smart cast to "String" is impossible
    }
}
