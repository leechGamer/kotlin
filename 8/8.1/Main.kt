// 다형성
open class Vehicle {
    open fun start() {
        println("I am moving")
    }
    open fun stop() {
        println("Stopped")
    }
}

class Car: Vehicle() {
    override fun start() {
        println("I am riding")
    }
}

class Boat: Vehicle() {
    override fun start() {
        println("I am sailng")
    }
}

fun startAndStop(vehicle: Vehicle) {
    vehicle.start()
    vehicle.stop()
}

fun main() {
    startAndStop(Car())
    startAndStop(Boat())
}
