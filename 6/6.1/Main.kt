// 6.1.2 enum 의 본문에 정의된 멤버를 해당 본문이 아닌 부분에서 접근할 수 없다
enum class WeekDay {
    MONDAY { fun startWork() = println("work week started") },
    TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

fun main() = WeekDay.MONDAY.startWork() // Error:: Unresolved reference: startWork
