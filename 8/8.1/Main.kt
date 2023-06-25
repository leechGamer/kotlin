// 8.1.1 반환 타입을 하위 타입으로 바꾸기
open class Vehicle {
    open fun start(): String? = null
}
class Car: Vehicle() {
    override fun start() = "I am riding a car"
}
fun main() {
    val vehicle: Vehicle = Car()
    vehicle.start()
}
