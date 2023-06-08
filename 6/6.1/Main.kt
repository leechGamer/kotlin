// 6.1.2 enum class에 생성자가 있으면 각 enum 상수의 정의 뒤에도 적절한 생성자 호출을 추가해야 한다. 
enum class RainbowColor(val isCold: Boolean) {
    RED(false), ORANGE(false), YELLOW(false), GREEN(true), BLUE(true), INDIGO(true), VIOLET(true);
    
    val isWarm get() = !isCold
}

fun main() {
    println(RainbowColor.RED.isCold)
    println(RainbowColor.GREEN.isWarm)
}
