// 람다 파라미터를 밑줄 기호로 지정할 수 있다.
fun check(s: String, condition: (Int, Char) -> Boolean) : Boolean {
    for (i in s.indices) {
        if (!condition(i, s[i])) return false
    }
    return true
}

fun main() {
    println(check("hello") { _, c -> c.isLetter() })
    println(check("hello") { i, c -> i == 0 || c.isLowerCase() })
}
