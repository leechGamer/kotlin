// 수신 객체가 있는 함숫값을 정의하는 호출 가능 참조를 만들 수 있다.
// 1. 클래스 멤버를 바탕으로
// 2. 확장 선언을 바탕으로
fun aggregate(numbers: IntArray, op: Int.(Int) -> Int) :Int {
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("empty array")

    for (i in 1..numbers.lastIndex) result = result.op(numbers[i])
    return result
}
fun Int.max(other: Int) = if (this > other) this else other // 확장 선언

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4)
    println(aggregate(numbers, Int::plus)) // case 1
    println(aggregate(numbers, Int::max)) // case 2
}
