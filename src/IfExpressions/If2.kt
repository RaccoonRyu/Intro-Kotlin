package IfExpressions

// 한 쪽에서 불리언 식을 만든 다음 다른 곳에서 그 식을 사용할 수도 있다.
fun main() {
    val x: Boolean = 1 >= 1 // 별도 불리언 식
    if (x)
        println("It's true!")
}