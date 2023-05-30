// 생성자는 항상 자신이 정의된 클래스의 객체를 반환하거나 예외를 던질 수만 있기 때문에
// 생성자를 비공개로 지정해 클래스 외부에서 사용할 수 없게하고, 내포된 객체에 팩토리 메서드 역할을 하는 함수를 정의 후 필요에 따라 생성자 호출
class Application private constructor(val name: String){ // 생성자를 비공개로 지정
    object Factory {
        fun create(args: Array<String>): Application?{
            val name = args.firstOrNull()?: return null
            return Application(name)
        }
    }
}

fun main(args: Array<String>) {
     //val app = Application("name")
    val app = Application.Factory.create(args) ?: return
    println("Application started:" ${app.name})
}
