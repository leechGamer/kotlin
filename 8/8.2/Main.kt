import java.lang.Exception
import java.lang.NumberFormatException

// 8.2.3 클래스 계층을 활용해 모델링
// 클래스 계층의 루트에 있는 추상 클래스는 전체 개념을 표현하고 하위클래스들은 특정 변종을 표현한다.
abstract class Result {
    class Success(val value: Any) : Result() {
        fun showResult() {
            println(value)
        }
    }

    class Error(val message: String) : Result() {
        fun throwException() {
            throw Exception(message)
        }
    }
}

fun runComputaion(): Result {
    try {
        val a = readLine()?.toInt() ?: return Result.Error("Missing first argument")
        val b = readLine()?.toInt() ?: return Result.Error("Missing second argument")
        return Result.Success(a + b)
    } catch (e: NumberFormatException) {
        return Result.Error(e.message ?: "Invalid input")
    }
}


fun main() {
    val message = when (val result = runComputaion()) {
        is Result.Success -> "Completed successfully : ${result.value}"
        is Result.Error -> "Error: ${result.message}"
        else -> return
    }
    println(message)
}
