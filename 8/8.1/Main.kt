// 8.1.3 as, as?
fun main() {
    val o: Any = 123
    println((o as Int) + 1)
    println((o as? Int)!! + 1)
    println((o as? String ?: "").length)
    println((o as String).length) // error: class cast exception
}
