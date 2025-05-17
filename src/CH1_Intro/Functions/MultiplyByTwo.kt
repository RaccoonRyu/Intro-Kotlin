package CH1_Intro.Functions
/*
    함수
    - 일련의 동작을 묶어 프로그램을 체계적으로 구성하고 코드를 재사용하는 가장 기본적인 방법
    - 함수에 정보를 전달하면, 함수는 그 정보를 이용해 계산을 수행하고 결과를 만들어 낸다.

    함수의 기본 형태
    fun 함수명(p1: 파라미터 타입, p2: 파라미터 타입, ...): 반환 타입 {
        여러 줄의 코드(한 줄 or 여러 줄) // 중괄호로 둘러싸진 함수 본문의 코드
        return 결과
    }
 */
fun main() {
    val r = multiplyByTwo(5)
    println(r)
}

fun multiplyByTwo(x: Int): Int {
    println("Inside multiplyByTwo")
    return x * 2
}