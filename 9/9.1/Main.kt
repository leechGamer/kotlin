// 타입 파라미터 바운드로 타입 파라미터를 사용할 수도 있으며, 이것을 재귀적 타입 파라미터라고 말한다.
fun <T: Comparable<T>> TreeNode<T>.maxNode(): TreeNode<T> {
    val maxChilde = children.maxByOrNull { it.data } ?: return this

    return if (data >= maxChilde.data) this else maxChilde
}


fun main() {
    // Double은 comparable<Double>의 하위 타입임

    val doubleTree = TreeNode(1.0).apply {
        addChild(2.0)
        addChild(3.0)
    }

    println(doubleTree.maxNode().data)

    val stringTree = TreeNode("abc").apply {
        addChildren("xyz", "def")
    }
    println(stringTree.maxNode().data)
}
