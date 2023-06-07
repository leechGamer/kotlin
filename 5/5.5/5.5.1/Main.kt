// let 함수: 처리해야 하는 값을 무조건 널이 될 수 없는 값으로만 전달해야 한다면

import java.lang.NumberFormatException

fun readInt() = try {
    readLine()?.toInt()
} catch (e: NumberFormatException) {
    null
}

fun main(args: Array<String>) {
    val index = readInt()
    val arg = index?.let { args.getOrNull(it) } // let을 활용해 간단히 notnull로 표현
    if (arg != null) println(arg)
}
