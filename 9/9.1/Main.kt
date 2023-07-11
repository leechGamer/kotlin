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



// 타입 파라미터 구문 예제 ===
fun<T: Any> notNullTreeOf(data: T) = TreeNode(data)


// 타입 파라미터 구문 활용 예제 ===
interface Named {
    val name: String
}

interface Identified {
    val id: Int
}

// where절을 클래스 선언 본문 앞에 추가하고 바운드할 타입 목록을 표시
class Registry<T> where T: Named, T: Identified {
    val items = ArrayList<T>()
}


// where절을 클래스 선언 본문 앞에 추가하고 바운드할 타입 목록을 표시
class Registry<T> where T: Named, T: Identified {
    val items = ArrayList<T>()
}

// error: Cannot check for instance of erased type: T
// 타입 소거 때문에 에러가 발생한다.
//JVM에서 타입 인자에 대한 정보는 코드에서 지워지고
//소스코드에서 List<String>이나 List<Number>같은 동일한 타입으로 합쳐진다.

// 런타임에 제네릭 코드는 파라미터 타입의 차이를 인식할 수 없고 앞에서 본 data is T와 같은 검사는 의미가 없다.
// isInstance() 함숙가 런타임에 호출될 때 T가 어떤 타입을 뜻할지 알 방법이 없다.

fun <T>TreeNode<Any>.isInstanceOf(): Boolean = data is T && children.all{ it.isInstanceOf<T>() }


