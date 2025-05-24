package CH1_Intro.LoopAndRange

fun main() {
    var sum = 0
    for (n in 10 .. 100) { // 10 부터 100 사이 정수의 합계를 계산하는 코드
        sum += n
    }
    println("sum = $sum")
}