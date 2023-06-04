fun max(a: Int, b: Int) = if (a > b) a else b
fun max(a: Double, b: Double) = if (a > b) a else b

val f: (Int, Int) -> Int = ::max
val g = ::max // Overload resolution ambiguity. All these functions match.
