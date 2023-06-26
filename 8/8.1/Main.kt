// 8.1.3 조건 안에서의 스마트 캐스트
fun main() {
    val objects = arrayOf("1",2,"3",4)
    var sum = 0
    for(o in objects) {
        when(o) {
            is Int -> sum += o
            is String -> sum += o.toInt()
        }
    }
    println(sum)
}
