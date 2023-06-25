// 8.1.1 super 키워드
open class Vehicle {
    open fun start(): String? = "I am moving"
}
open class Car: Vehicle() {
    override fun start(): String? {
        return super.start() + "in a car"
    }
}

fun main() {
    println(Car().start())
}
