fun describeNumber(n: Int?) = when(n) {
    null -> "null"
    in 0..10 -> "small"
    in 11 .. 100 -> "large"
    else -> "out of range"
}

fun isSingleChar(s: String?) = s != null && s.length == 1


fun main() {
    var s = readLine()
    if (s != null) {
        s = readLine()
        // s값이 바껴서 스마트 캐스트 할 수 없다.
        println(s.length) // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String
    }
}
