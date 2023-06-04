// 람다에 인자가 없으면 화살표 기호를 생략할 수 있다.
fun measureTime(action: () -> Unit): Long {
    val start = System.nanoTime()
    action()
    return System.nanoTime() - start
}

val time = measureTime { 1 +2 }

// 코틀린은 인자가 하나밖에 없는 람다를 특별히 단순화해 사용할 수 있는 문법을 제공한다.
fun check(s: String, condition: (Char) -> Boolean) : Boolean {
    for (c in s) {
        if (!condition(c)) return false
    }
    return true
}

fun main() {
    println(check("hello") { c -> c.isLetter() })
    println(check("hello") { it.isLowerCase() })
}
