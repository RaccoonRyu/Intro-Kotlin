package CH1_Intro.Booleans

// 연산 순서에 따라 결과가 달라지는 Boolean
fun main() {
    val sunny = true
    val hoursSleep = 6
    val exercise = false
    val temp = 55

    val happy1 = sunny && temp > 50 || exercise && hoursSleep > 7
    println(happy1)

    val sameHappy1 = (sunny && temp > 50) || (exercise && hoursSleep > 7)
    println(sameHappy1) // happy1과 sameHappy1의 결과는 동일하다. 괄호가 없는 경우 &&가 먼저 평가되고 ||가 평가되기 때문.

    val notSame = (sunny && temp > 50 || exercise) && hoursSleep > 7
    println(notSame) // notSame의 경우 잠을 7시간 이상 잤을 때 또한 만족해야하므로 다른 결과를 표시한다.
}