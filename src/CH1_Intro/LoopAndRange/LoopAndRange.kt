package CH1_Intro.LoopAndRange

// 범위를 역방향으로 이터레이션 할 수도 있고, step 값을 사용하면 값의 간격을 1이 아닌 값으로 조정할 수 있다.
// IntProgression : Int 범위를 포함하는 타입
fun showRange(r: IntProgression) {
    for (i in r) {
        print("$i ")
    }
    print(" // $r")
    println()
}

fun main() {
    showRange(1 .. 5)
    showRange(0 until 5)
    showRange(5 downTo 1) // downTo : 감소하는 범위를 만든다
    showRange(0 .. 9 step 2) // step : 간격을 변경한다 (이 경우에서는 범위 내 값이 1이 아니라 2씩 변한다.)
    showRange(0 until 10 step 3)
    showRange(9 downTo 3 step 3)
}