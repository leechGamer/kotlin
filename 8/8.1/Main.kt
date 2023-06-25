// 8.1.1 프로퍼티 오버라이드
open class Entity {
    open val name: String get() = ""
}

class Person(override val name: String) : Entity()
