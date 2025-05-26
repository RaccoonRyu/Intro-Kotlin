package CH1_Intro.InKeyword

fun inFloatRange(n: Double) {
    val r = 1.0 .. 10.0 // Double도 범위를 만들 수 있지만, 원소인지 여부를 검사할 때만 Double의 범위를 쓸 수 있다.
    println("$n in $r? ${n in r}")
}

fun main() {
    inFloatRange(0.999999)
    inFloatRange(5.0)
    inFloatRange(10.0)
    inFloatRange(10.0000001)

    // 부동 소수점 범위에서 반 열린 범위를 만들 때는 .. < 를 사용할 수 있다.
    // ex) 1.0 .. < 2.0은 1.0 이상 2.0 미만인 범위를 만든다.
}