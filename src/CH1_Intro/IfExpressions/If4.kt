package CH1_Intro.IfExpressions

fun main() {
    val n: Int = -11
    if (n > 0) // if 문에서 불리언 식 검사를 딱 한 번만 해야 할 필요는 없다.
        println("It's positive")
    else if (n == 0) // else if를 함께 사용해 다양한 논리 조합을 검사할 수도 있다.
        println("It's zero")
    else
        println("It's negative")
}