// 제네릭 클래스에 정의된 함수와 프로퍼티에서 .. 클래스의 타입 파라미터를 사용할 수 있다.
// 프로퍼티나 함수에 타입 파라미터를 추가하면 ..프로퍼티나 함수 자체를 제네릭으로 만들 수 있다... 

// 책 예제..
fun <T> TreeNode<T>.addChildren(vararg data: T) {
    data.forEach { addChild(it) }
}

fun <T> TreeNode<T>.walkDepthFirst(action: (T) -> Unit) {
    children.forEach { it.walkDepthFirst(action) }
    action(data)
}

val <T> TreeNode<T>.depth: Int
    get() = (children.asSequence().map { it.depth }.maxOrNull() ?: 0) + 1

fun main() {
    val root = TreeNode("Hello").apply {
        addChildren("world", "!!!")
    }

    println(root.depth)
}


