// values 메서드, enumValues, enumValueOf
enum class WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
private val weekDays = WeekDay.values()
val WeekDay.nextDay get() = weekDays[(ordinal + 1) % weekDays.size]


fun main() {
    val weekDays = enumValues<WeekDay>()
    println(weekDays[2])
    println(enumValueOf<WeekDay>("THURSDAY"))
}
