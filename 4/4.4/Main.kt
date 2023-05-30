// 객체 식도 자신을 둘러싼 코드 영역의 변수를 포획할 수 있다.
fun main() {
    var x = 1

    val o = object {
        fun change() {
            x = 2
        }
    }
    o.change()
    println(x) // 2
}
