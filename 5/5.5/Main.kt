
// 수신 객체가 아닌 일반 함수 타입의 파라미터를 받는 함수에
// 수신 객체가 지정된 호출가능 참조를 전달할 수도 있다
fun aggregate(numbers: IntArray, op: (Int, Int) -> Int) : Int {
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException()


    for (i in 1.. numbers.lastIndex) result = op(result, numbers[i])

    return result
}

fun Int.max(other: Int) = if(this > other) this else other

fun main() {
    println(aggregate(intArrayOf(1,2,3,4), Int::max)) // 멤보에 대한 호출 가능참조
    println(aggregate(intArrayOf(1,2,3,4), Int::plus)) // 확장 함수에 대한 호출 가능 참조
}

