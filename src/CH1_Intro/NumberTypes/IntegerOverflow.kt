package CH1_Intro.NumberTypes

fun main() {
    val i: Int = Int.MAX_VALUE
    println(i + 1) // 코틀린 Int 타입의 최댓값을 초과하는 경우 overflow가 발생한다.
    // 오버플로우가 발생하면 음수이면서 예상보다 훨씬 작은 값이 나오는 명백히 틀린 결과를 반환한다.
}