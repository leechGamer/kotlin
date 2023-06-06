// 수신 객체가 있는 함수값을 호출할 때는
// 확장함수가 아닌 일반 함수형태로 호출할 수도 있다

fun aggregate(numbers: IntArray, op: Int.(Int) -> Int): Int {
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("empty array")

    for (i in 1..numbers.lastIndex) {
        //result = result.op(numbers[i]) // 확장함수 문법 이용
        result = op(result, numbers[i]) // 비확장함수 호출
    }
    return result
}
