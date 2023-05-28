class Person (private val firstName: String, private val familyName: String) {
    inner class Possession(val description: String) {
        fun showOwner() = println(fullName())
    }
    private fun fullName() = "$firstName $familyName"
}

fun main() {
   class Point(val x: Int, val y: Int) {
       fun shift(dx: Int, dy: Int): Point = Point(x + dx, dy)
       override fun toString() = "($x, $y)"
   }
    val p = Point(10, 10)
    println(p.shift(-1, 3))
}

fun foo() {
    println(Point(0,0)) // error : unresolved reference : Point
}
