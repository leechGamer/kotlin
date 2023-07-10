
// 상위 바운드로 Number를 선언하기
fun <T: Number>TreeNode<T>.average(): Double {
    var count = 0
    var sum = 0.0

    walkDepthFirst {
        count++
        sum += it.toDouble()
    }
    return sum / count
}




