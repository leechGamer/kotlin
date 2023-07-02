// interface에서 interface로 상속할 때도 메서드를 오버라이드할 수 있다.
interface Vehicle {
    fun move() {
        println("I am moving")
    }
}

interface Car: Vehicle {
    override fun move() {
        println("I am riding")
    }
}


