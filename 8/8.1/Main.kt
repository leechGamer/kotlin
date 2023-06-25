// 8.1.1 protected
open class Vehicle {
    protected open fun onStart() {} // 하위클래스만 접근 가능
    fun start() {
        println("Starting up..")
        onStart()
    }
}

class Car: Vehicle() {
    override fun onStart() {
        println("Its a car")
    }
}

fun main() {
    val car = Car()
    car.start()
    car.onStart() // Cannot access 'onStart': it is protected in 'Car'
}
