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

// 위 코드의 ----------- main()은 아래와 같이 해석 되었다.

fun main() {
    val numbers = intArrayOf(4, 3, 2, 1)
    var index = -1

    for (i in numbers.indices) {
        if (numbers[i] < 3) {
            index = i
            break
        }
    }
    println(index)
}
