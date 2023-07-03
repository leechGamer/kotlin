// 인터페이스에 대한 생성자는 금지돼 있다.

interface Vehible {
    constructor(name: String)
}


// 다중 상속을 지원한다.
interface Car {
    fun ride()
}

interface Aircraft {
    fun fly()
}

interface Ship {
    fun sail()
}

interface FlyingCar: Car, Aircraft

class Transformer: FlyingCar, Ship {
    override fun ride() {
        println("I am riding")
    }

    override fun fly() {
        println("Fluginf")
    }

    override fun sail() {
        println("Saiing")
    }
}

// 합쳐지는 멤버에 대한 구현이 둥 이상의 상위 타입에 존재하는 경우 super 호출이 모호해진다.
// 이럴때는 super를 상위 타입으로 한정시킨 키워드를 사용해야 한다.
interface Car {
    fun move() {
        println("I am moving")
    }
}

interface Ship {
    fun move() {
        println("I am sailing")
    }
}

class Amphibia: Car, Ship {
    override fun move() {
        super<Car>.move() // car의 메서드
        super<Ship>.move() // ship의 메서드
    }
}

fun main() {
    Amphibia().move()
    /*      
        I am moving
        I am sailing
    */
}





