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
