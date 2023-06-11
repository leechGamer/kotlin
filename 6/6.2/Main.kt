// triplet / pair
fun main() {
    val pair = Pair(1, "two")

    println(pair.first + 1) // 2
    println("${pair.second}!") // two!

    val triple = Triple("one", 2, false)

    println("${triple.first}!") // one!
    println(triple.second - 1) // 1
    println(!triple.third)// true
}
