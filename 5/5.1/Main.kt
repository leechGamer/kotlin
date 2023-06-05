// 인라인 함수가 널이 될 수 있는 함수 타입의 인자를 받을 수도 없다
inline fun forEach(a: IntArray, action: ((Int) -> Unit)?) {
    if (action == null) return
    for (n in a) action(n)
}
