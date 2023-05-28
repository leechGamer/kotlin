fun isLetterString(s: String): Boolean {
    if (s.isEmpty()) return  false
    for (ch in s) {
        if (! ch.isLetter()) {
            return false
        }
    }
    return true
}

fun main() {
  println(isLetterString("abc"))
  println(isLetterString(null)) // Null can not be a value of a non-null type String
}
