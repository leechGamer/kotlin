// 다른 패키지에 최상위 확장 함수가 정의된 경우, 확장함수를 호출하기 전에 반드시 확장을 import !
package main

import util.truncate

fun main() {
    println("hello".truncate(3))
}
