package IfExpressions

fun main() {
    val n: Int = -11
    if(n > 0)
        println("It's positive")
    else // else 키워드를 사용하면 true인 경로와 false인 경로를 모두 처리할 수 있다.
        println("It's negative or zero")
    // else 키워드는 if와 함께 사용해야 의미가 있다.
}