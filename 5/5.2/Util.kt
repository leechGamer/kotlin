package util

fun String.truncate(maxL: Int): String {
    return if (length <= maxL) this else substring(0, maxL)
}
