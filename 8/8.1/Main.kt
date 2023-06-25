// 8.1.2 하위 클래스 초기화
// 상위 클래스에서부터 하위 클래스 순서로 초기화 진행
open class Vehicle {
    init {
        println("Initializing Vehicle")
    }
}
open class Car: Vehicle() {
    init {
        println("Initializing Car")
    }
}

class Truck: Car() {
    init {
        println("Initializing Truck")
    }
}

fun main() {
    Truck()
}
