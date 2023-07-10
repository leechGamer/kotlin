
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

// 타입 파라미터에 상위 바운드가 있으면 컴파일러는 이 타입 파라미터에 공급된 타입 인자의 타입이 상위 바운드의 하위 타입이지 검사한다.
val intTree = TreeNode(1).apply {
    addChild(2).addChild(3)
    addChild(4).addChild(5)
}

fun main() {
    println(intTree.average())
}
