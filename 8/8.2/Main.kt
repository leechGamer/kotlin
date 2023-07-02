// 8.2.2 인터페이스
// 인터페이스는 클래스나 다른 인터페이스의 상위 타입이 될 수 있다
interface Vehicle {
    val currentSpeed: Int
    fun move()
    fun stop()
}


interface FlyingVehicle: Vehicle {
    val currentHeight: Int
    fun takeOff()
    fun land()
}

// 비추상 클래스가 인터페이스를 상속할 때는 모든 추상 멤버에 대한 구현을 제공해야 한다.
class Car: Vehicle {
    override var currentSpeed: Int = 0

        private set
    override fun move() {
        println("Riding..")
        currentSpeed = 50
    }

    override fun stop() {
        println("Stop..")
        currentSpeed = 0
    }

    class Aircraft: FlyingVehicle {
        override var currentSpeed = 0
            private set

        override fun move() {
            println("Taxiing..")
            currentSpeed = 50
        }

        override fun stop() {
            println("Stopped")
            currentSpeed = 0
        }

        override var currentHeight: Int = 0
            private set

        override fun takeOff() {
            println("Taking off..")
            currentSpeed = 500
            currentHeight = 5000
        }

        override fun land() {
            println("Landed..")
            currentSpeed = 50
            currentHeight = 0
        }
    }
}

