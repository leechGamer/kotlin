// 수신 객체가 없는 호출 가능 참조를
// 수신 객체가 필요한 함수 타입의 값 대신 사용 가능
// Int.(Int) -> Int 타입의 파라미터를 받는 고차 함수에 인자가 두 개인 :: max를 전달해도 됨
fun aggregate(numbers: IntArray, op: Int.(Int) -> Int): Int {
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("empty Array")

    for(i in  1.. numbers.lastIndex) result = result.op(numbers[i])

    return result
}
fun max(a: Int, b: Int) = if(a > b) a else b
fun main() {
    println(aggregate(intArrayOf(1,2,3,4), ::max))
}
