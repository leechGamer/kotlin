// 인라인이 될 수 있는 람다를 사용해 할 수 있는 일은
// 1. 람다를 호출하거나
// 2. 다른 인라인 함수에 인라인이 되도록 넘기는 두가지 경우뿐이다.

var lastAction: () -> Unit = {}

inline fun runAndMemorize(action: () -> Unit) {
    action()
    lastAction = action // Illegal usage of inline-parameter 'action' in 'public inline fun runAndMemorize(action: () -> Unit): Unit defined in root package in file Calc.kt'. Add 'noinline' modifier to the parameter declaration
}
