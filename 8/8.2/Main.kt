import java.lang.NumberFormatException

// 8.2.3 봉인된 클래스와 인터페이스

enum class Result {
    SUCCESS, ERROR
}

fun runComputation(): Result {
    try {
        val a = readLine()?.toInt() ?: return Result.ERROR
        val b = readLine()?.toInt() ?: return Result.ERROR

        println("Sum: ${a + b}")
    } catch (e: NumberFormatException) {
        return Result.ERROR
    }
    return Result.SUCCESS
}

fun main() {
    val message = when(runComputation()) {
        Result.SUCCESS -> "Completed successfully"
        Result.ERROR -> "Error!"
    }
    println(message)
}
