// 코틀린에서는 람다나 익명함수에 대해서돋 확장 수신 객체를 활용할 수 있다. 
fun aggregate(numbers: IntArray, op: Int.(Int) -> Int): Int {
    var result = numbers.firstOrNull() ?: throw IllegalArgumentException("Empty array")

    for (i in 1..numbers.lastIndex) result = result.op(numbers[i])

    return result
}

fun sum(numbers: IntArray) = aggregate(numbers){ op -> this + op} // 람다에 대해서도 확장 수신 객체를 활용할 수 있다
fun sum2(numbers: IntArray) = aggregate(numbers, fun Int.(op: Int) = this + op) // 익명함수에 대해서도 확장 함수 뭄법을 사용할 수 있다

