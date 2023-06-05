// inline 기법 : 함수 값을 사용하는 고차 함수를 호출하는 부분을 해당 함수의 본문으로 대체

inline fun indexOf(numbers: IntArray, condition: (Int) -> Boolean): Int {
    for (i in numbers.indices) {
        if (condition(numbers[i])) return 1
    }
    return -1
}

fun main() {
    println(indexOf(intArrayOf(4, 3, 2, 1)) { it < 3 })
}
