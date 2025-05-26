package CH1_Intro.InKeyword

fun main() {
    println("ab" in "aa" .. "az")
    println("ba" in "aa" .. "az") // String이 어떤 String 범위 안에 속하는지를 검사할 수도 있다.
    // 코틀린은 알파벳 순으로 문자열을 비교한다.
}