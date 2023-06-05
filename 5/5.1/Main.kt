// 인라인 함수가 널이 될 수 있는 함수 타입의 인자를 받을 수도 없다
inline fun forEach(a: IntArray, action: ((Int) -> Unit)?) { // Inline-parameter 'action: ((Int) -> Unit)?' of 'public inline fun forEach(a: IntArray, action: ((Int) -> Unit)?): Unit defined in root package in file Calc.kt' must not be nullable. Add 'noinline' modifier to the parameter declaration or make its type not nullable
    if (action == null) return
    for (n in a) action(n)
}
