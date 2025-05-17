package CH1_Intro.IfExpressions

fun oneOrTheOther(exp: Boolean): String =
    if(exp)
        "True"
    else
        "False"
    // return문 대신 else 키워드와 함께 if 식을 사용해 결과를 만들어낼 수 있다.

fun main() {
    val x = 1
    println(oneOrTheOther(x == 1))
    println(oneOrTheOther(x == 2))
}