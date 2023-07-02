// 코틀린 인터페이스가 다른 클래스를 상송할 수는 없다. 단, 모든 코틀린 클래스와 인터페이스가 암시적으로 상속하는 것으로 간주되는 Any 클래스는 예외다.
// 인터페이스 안의 함수와 프로퍼티에 구현을 추가할 수도 있다.
interface Vehicle {
    val currentSpeed: Int
    val isMoving get() = currentSpeed != 0
    final fun move() // error: Modifier 'final' is not applicable inside 'interface'
    fun stop()
    fun report() {
        println(
            if(isMoving) "Moving at $currentSpeed" else "Still"
        )
    }
    fun Vehicle.relativeSpeed(vehicle: Vehicle) = currentSpeed - vehicle.currentSpeed
}
