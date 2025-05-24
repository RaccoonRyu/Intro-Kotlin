package CH1_Intro.LoopAndRange

// 범위 : 양 끝을 포현하는 두 정수 사용해 구간을 정의하는 것
fun main() {
    val range1 = 1 .. 10 // 값1 .. 값2 : 양 끝 값을 포함하는 범위를 만든다.
    val range2 = 0 until 10 // 값1 until 값2 : 값2에 오는 값을 제외한 범위를 만든다.
    println(range1)
    println(range2)
}