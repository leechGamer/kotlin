// 확장 프로퍼티에서도 위임을 사용할 수 있다.
// 하지만 위임식이 프로퍼티의 수신객체에 접근할 수 없다.
val String.message by lazy{"hello"}

fun main() {
    println("Hello".message)
    println("Bye".message)
}
