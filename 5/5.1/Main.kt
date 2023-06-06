fun String.truncate(maxLength: Int): String {
    return if (length <= maxLength) this else substring(0, maxLength)
}
fun main() {
    println("hello".truncate(10))
    println("hello".truncate(3))
}
