// noline을 붙이면 특정 람다를 인라인하지 말라고 할 수있다.
inline fun forEach(a: IntArray, noinline action: ((Int) -> Unit)?) {
    if (action == null) return
    for (n in a) action(n)
}
