// 8.1.1 오버라이드하는 멤버를 final로 선언하면 더 이상 하위 클래스가 이 멤버를 오버라이드할 수 없다
open class Vehicle {
    open fun start() {
        println("I am moving")
    }
}

open class Car: Vehicle() {
    final override fun start() {
        println("I am riding a car")
    }
}

class Bus: Car() {
    override fun start() { // 'start' in 'car' is final and cannot be overridden 
        println("I am riding a bus")
    }
}
