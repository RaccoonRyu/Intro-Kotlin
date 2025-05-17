package Functions

// 코틀린은 식 본문의 반환 타입만을 추론한다.
// 함수 본문이 블록 본문이고 그 함수의 반환 타입을 명시하지 않으면 함수의 반환 타입이 Unit이라 지정한 것과 같다.
fun main() {
    val result: Int = multiplyByFour(5)
    println(result)
}

fun multiplyByFour(x: Int) = x * 4