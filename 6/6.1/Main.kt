// 6.1.2 커스텀 멤버가 있는 enum 정의하기
enum class WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    val lowerCaseName get() = name.lowercase()
    fun isWorkday() = this == SATURDAY || this == SUNDAY
}

fun main() {
    println(WeekDay.MONDAY.isWorkday())
    println(WeekDay.WEDNESDAY.lowerCaseName)
}
