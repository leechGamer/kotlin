// 8.1.1 하위 클래스 선언
// open class 상속에 열려있다.
// open이 안붙어 있는 class 상속할 수 없음
open class Vehicle {
    var currentSpeed = 0
    fun start() {
        println("I am moving")
    }
    fun stop() {
        println("Stopped")
    }
}
open class FlyingVehicle : Vehicle() {
    fun takeOff() {
        println("Taking off")
    }
    fun land() {
        println("Landed")
    }
}
class Aircraft(val seats: Int) : FlyingVehicle()
