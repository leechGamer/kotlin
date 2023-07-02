abstract class Entity(val name: String)

// 하위 클래스에서 위임 호출
class Person(name: String, val age: Int): Entity(name)

// error: cannot create an instance of an abstract class
val entity = Entity("unknown")
