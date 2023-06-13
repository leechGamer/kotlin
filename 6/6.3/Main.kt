// 인라인 클래스 인스턴스는 다른 어떤 타입의 값으로 캐스팅하지 않고도
// 정확히 상응하는 타입의 값으로 사용될 수 있는 경우에 인라인될 수 있다는 규칙이 있다.
@JvmInline
value class Dollar(val amount: Int) 

fun safeAmount(dollar: Dollar?) = dollar?.amount ?: 0
fun main() {
    println(Dollar(15).amount) // 인라인 됨 
    println(Dollar(15)) // Any? 로 사용되기 때문에 인라인되지 않음 
    println(safeAmount(Dollar(15)))// Dollar?로 사용되기 때문에 인라인되지 않음
}
