// 6.1.3 enum class의 공통 멤버 사용하기
enum class Direction {
    NORTH, WEST, SOUTH, EAST;
}

fun main() {
    println(Direction.WEST.name) // WEST
    println(Direction.WEST.ordinal) // 2
    println(Direction.WEST != Direction.NORTH) // true
    println(Direction.WEST <= Direction.EAST) // true
}
