fun check(s: String, condition: (Char)-> Boolean) : Boolean {
    for (c in s) {
        if (!condition(c)) return false
    }
    return true
}
fun isCapitalLetter(c: Char) = c.isUpperCase() && c.isLetter()

fun main() {
    println(check("hello") {c -> isCapitalLetter(c)})
    println(check("hello") {isCapitalLetter(it)})
    println(check("hello", ::isCapitalLetter(it))
}
