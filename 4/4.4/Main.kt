// 익명 객체 타입은 지역 선언이나 비공개 선언에만 전달될 수 있다

fun midPoint(xRange: IntRange, yRange: IntRange) = object {
    val x = (xRange.first + xRange.last)/2
    val y = (xRange.first + xRange.last)/2
}
fun main() {
    val mid = midPoint(1..5, 2..6)
    println("${mid.x}, ${mid.y}") // Unresolved reference: x, y
}
