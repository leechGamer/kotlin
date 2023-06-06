// nullable 한 수신 객체 타입
fun String?.truncate(maxL: Int): String? {
    if(this == null) return null
    return if(length <= maxL) this else substring(0, maxL)
}

fun main() {
    val s = readLine()
    println(s.truncate(3))
}
