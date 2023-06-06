val IntArray.midIndex // 확장 프로퍼티 midIndex
    get() = lastIndex / 2

var IntArray.midValue // 확장 프로퍼티 midValue
    get() = this[midIndex]
    set(value) {
        this[midIndex] = value
    }

fun main() {
    val numbers = IntArray(6) { it * it }

    println(numbers.midValue)
    numbers.midValue *= 10
    println(numbers.midValue)
}
