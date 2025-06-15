package CH2_Object.ObjectsEverywhere

// 수 타입을 다른 수 타입으로 변환하는 예제
fun fraction(numerator: Long, denom: Long) = numerator.toDouble() / denom

fun main() {
    val num = 1
    val den = 2
    val f = fraction(num.toLong(), den.toLong()) // 정수를 Long으로 변환하여 함수 호출
    println(f)
}