// U가 T의 하위 타입이므로 트리 원소의 타입보다 더 일반적인 타입의 리스트를 인자로 받을 수 있다.
fun <T, U: T> TreeNode<U>.toList(list: MutableList<T>) {
    walkDepthFirst { list += it }
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
    
    // 바운드가 자신보다 앞에 있는 타입 파라미터를 가리킬 수도 있다.
    // 이런 바운드를 사용해 트리 원소를 가변 리스트에 추가하는 함수를 정의할 수 있다.
    
    // Int트리나 Double 트리에 있는 원소들은 Number 타입의 리스트에 추가할 수 있다. 
    val list = ArrayList<Number>()
    
    TreeNode(1).apply { 
        addChild(2)
        addChild(3)
    }.toList(list)
    
    TreeNode(1.0).apply { 
        addChild(2.0)
        addChild(3.0)
    }.toList(list)
}
