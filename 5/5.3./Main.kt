// 확장 프로퍼티: 다른 일반 멤버 프로퍼티와 마찬가지 방법으로도 확장 프로퍼티에 접근할 수 있다.
val IntRange.leftHalf: IntRange
    get() = start.. (start + endInclusive) / 2

fun main() {
    println((1..3).leftHalf)
    println((3..6).leftHalf)
}
