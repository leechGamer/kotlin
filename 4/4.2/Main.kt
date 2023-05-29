fun isLetterString(s: String?): Boolean {
    if (s == null) return false
    if (s.isEmpty()) return false
    for (ch in s) {
        if (!ch.isLetter()) return false
    }
    return true
}

fun main() {
    isLetterString(null)
}
