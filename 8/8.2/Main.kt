import kotlin.math.PI

// 8.2.1 추상멤버: 타입, 파라미터, 반환 타입 등 함수나 프로퍼티의 기본적인 모습을 정의하지만 세부 구현은 생략한 멤버

abstract class Shape {
    abstract val width: Double
    abstract val height: Double
    abstract fun area(): Double
}

class Circle(val r: Double) : Shape() {
    val diameter get() = 2 * r
    override val width: Double
        get() = diameter
    override val height: Double
        get() = diameter

    override fun area() = PI * r * r
}

class Rectangle(
    override val width: Double,
    override val height: Double
) : Shape() {
    override fun area() = width * height
}

fun Shape.print() {
    println("Bounds: $width* $height, area: ${area()}")
}

fun main() {
    Circle(10.0).print()
    Rectangle(3.0, 5.0).print()
}
