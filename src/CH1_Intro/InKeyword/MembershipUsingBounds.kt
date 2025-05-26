package CH1_Intro.InKeyword

fun main() {
    val percent = 35
    println(0 <= percent && percent <= 100)
    println(percent in 0 .. 100) // 위-아래 두 문장은 모두 같은 결과를 표현한다.
}