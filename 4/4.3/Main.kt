import java.util.*

class Person(name: String) {
    var lastChanged: Date? = null
        private set // Person class 밖에서 변경할 수 없다
    var name: String = name
        set(value) {
            lastChanged = Date()
            field = value
        }
}
