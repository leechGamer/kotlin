// 제네릭 선언
// 컴파일러가 문맥에서 타입 인자의 타입을 추론할 수 있으면 타입 인자를 생략할 수 있는 경우도 있다.

val map: Map<Int, String> = HashMap() // map의 타입을 명시했기 때문에 hashmap 클래스의 타입 인자를 추론할 수 있음
val list = arrayListOf("abc", "def") // arrayListOf()에 전달된 인자의 타입(모두 String)으로부터 타아비 인자를 추론할 수 있음



// Java와 코틀린의 타입 추론의 차이
// Java : 다이아몬드 연산자를 추가해야 한다. 자바5 이전 코드와의 하위 호환성을 유지하기 위해서다.
//Map<Int, String> map = new HashMap<>()
// kotlin:
/*
class TreeNode<T>(val data: T) {
    private val _children = arrayListOf<TreeNode<T>>()
    var parent: TreeNode<T>? = null
        private set
    val children: List<TreeNode<T>> get() = _children

    fun addChild(data: T) = TreeNode(data).also {
        _children += it
        it.parent = this
    }

    override fun toString() = _children.joinToString(prefix = "$data {", postfix = "}")
}
 */

fun main() {
    val root = TreeNode("hello").apply {
 //       addChild("World")
 //       addChild("!!!")
    }

    println(root)
}

// 타입 인자가 불필요한 경우 컴파일러가 문맥에서 타입 인자를 추론해준다.
open class DataHolder<T>(val data: T)

// 실제 타입을 상위 타입 인자로 넘김
//class StringDataHolder(data: String) : DataHolder<String>(data)

// 타입 인자를 상위 타입의 타입 인자로 넘김
class TreeNode<T>(data: T): DataHolder<T>(data) {}


// 컴파일러는 일반 생성자 호출과 달리 생성자 위임 호출의 타입 인자를 추론해주지 못한다.
// 따라서 함상 위임 호출의 타입 인자를 명시해야 한다.
// error: One type argument expected for class DataHolder<T>
class StringDataHolder(data: String): DataHolder(data)

// Ok: DataHolder<String>을 컴파일러가 추론함
fun stringDataHolder(data: String) = DataHolder(data)
