// IntRange클래스의 companion object에 대한 확장 함수를 정의한다.
fun IntRange.Companion.singletonRange(n: Int) = n..n

fun main() {
    println(IntRange.singletonRange(5))
    println(IntRange.Companion.singletonRange(3))
}
