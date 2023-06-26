// 8.1.3 is 연산자
val obj = arrayOf("1", 2, "3", 4)

var sum = 0

fun main() {
    for (o in obj) {
       if (o is Int) {
           sum += o // obj 타입을 Int로 세분화 함
       }
    }
    println(sum) // 6
}
