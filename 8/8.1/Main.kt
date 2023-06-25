// 8.1.1 항상 정적으로 알려진 수신객체 타입을 기반으로 초출할 확장을 선택한다. 컴파일러는
open class Vehicle {
    open fun start() {
        println("I am moving")
    }
}

fun Vehicle.stop() {
    println("Stopped")
}

class Car: Vehicle() {
    override fun start() {
        println("I am riding")
    }
}

fun Car.stop() {
    println("Stopped riding")
}

fun main() {
    val vehicle: Vehicle = Car()
    vehicle.start()
    vehicle.stop()
}
