package CH1_Intro.Booleans

// || : 논리합. 연산자 오른쪽과 왼쪽에 있는 Boolean 식 중 하나라도 true면 true를 반환한다.
fun isClosed(hour: Int) {
    val open = 9
    val closed = 20
    println("Operating hours : $open - $closed")
    val status = hour < open || hour > closed
    println("Closed : $status")
}

fun main() {
    isClosed(6)
}