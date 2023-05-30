
class Application private constructor(val name: String){ // 생성자를 비공개로 지정
    companion object {
        fun create(args: Array<String>): Application?{
            val name = args.firstOrNull()?: return null
            return Application(name)
        }
    }
}

fun main(args: Array<String>) {
    val app = Application.create(args) ?: return
    println("Application started:" ${app.name})
}
