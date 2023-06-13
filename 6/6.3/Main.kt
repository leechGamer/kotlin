// 인라인 클래스 정의하기
// 1. 인라인 클래스를 정의하려면 value class를 클래스 이름 앞에 붙여야한다.
// 2. JVM 백엔드를 사용하는 경우에는 @JvmInline을 value class 앞에 반드시 붙여줘야 한다.
@JvmInline
value class Dollar(val amount: Int)
@JvmInline
value class Euro(val amount: Int)
