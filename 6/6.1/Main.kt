enum class WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

fun WeekDay.isWorkDay() = this == WeekDay.SATURDAY || this == WeekDay.SUNDAY

fun main() {
    println(WeekDay.MONDAY.isWorkDay())
    println(WeekDay.SATURDAY.isWorkDay())
}
