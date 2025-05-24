package CH1_Intro.RepWithWhile

// 복합 대입 연산자를 사용하여 모든 산술 연산과 대입을 함께 사용할 수 있다.
fun main() {
    var n = 10
    val d = 3
    print(n)
    while(n > d) {
        n -= d // 뺄셈과 대입을 함께 수행한다.
        print(" - $d")
    }
    println(" = $n")
    var m = 10
    print(m)
    m %= d // 나머지 연산과 대입을 함께 수행한다.
    print(" % $d = $m")
}