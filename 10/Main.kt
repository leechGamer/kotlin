import org.junit.Test

class MyTestCase {
    @Test
    fun testOnePlusOne() {
        assert(1 + 1 == 2)
    }
}


//case 1
//Expression annotations with retention other than SOURCE are prohibited
@Target(AnnotationTarget.EXPRESSION)
annotation class NeedToRefactor

// case 1을 해결하려면 명시적으로 SOURCE 유지 시점을 지정해야 한다.
@Target(AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
annotation class NeedToRefactor 

// @Repeatable이 붙은 애너테이션을 같은 언어 요소에 두 번 이상 반복 적용할 수 있다.
@Repeatable
@Retention(AnnotationRetention.SOURCE)
annotation class Author(val name: String)

@Author("John")
@Author("Harry")
class Services


// 기본적으로 애너테이션을 반복 적용할 수 없다
@Deprecated("Deprecated")
@Deprecated("Even more deprecated") // error: This annotation is not repeatable
class OldClass
