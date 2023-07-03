// 8.2.2 인터페이스에 생성자나 상태를 사용할 수 없다는 제약은 다중 상속을 지원하기 위한 것으로 다이아몬드 상속 문제를 방지하는 데 있다.

interface Vehicle {
    val currentSpeed: Int
}

interface Car: Vehicle

interface Ship: Vehicle

class Amphibia: Car, Ship {
    override var currentSpeed = 0
        private set
}
