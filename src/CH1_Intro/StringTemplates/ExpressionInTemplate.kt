package CH1_Intro.StringTemplates

fun main() {
    val condition = true
    // ${} 중괄호 안에 식을 넣으면 해당 식을 평가하고, 평가한 결괏값을 String으로 변환한다.
    println("${if (condition) 'a' else 'b'}")
    val x = 11
    println("$x + 4 = ${x + 4}")
}