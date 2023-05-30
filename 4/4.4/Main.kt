// 객체식의 타입이 익명 객체 타입이며 지역변수나 프로퍼티의 타입도 마찬가지 일 수 있음을 보여준다
fun main() {
    val o = object { // 익명 객체 타입이 추론된다.
        val x = readLine()!!.toInt()
        val y = readLine()!!.toInt()
    }
    println(o.x + o.y)
}
