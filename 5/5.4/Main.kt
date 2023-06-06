// 리터럴이 아닌 함숫값
// 자유롭게 수신 객체가 있는 함수 타입 값과 수신 객체가
// 첫번째 파라미터인 일반 함수 타입 값의 역할을 할 수 있다.
// 이 두타입의 값이 런타임에는 똑같이 표현되기 때문
fun main() {
    val min1: Int.(Int) -> Int = { if (this < it) this else it }
    val min2: (Int,Int) -> Int = min1 // 수신 객체가 첫번째 파라미터인 일반함수 타입
    
    println(3.min1(2))
    println(min1(1, 2))  
    println(3.min2(2)) // error: 수신객체가 없는 함숫값은 비확장 형태로만 호출 가능
    println(min2(1,2)) 
}
