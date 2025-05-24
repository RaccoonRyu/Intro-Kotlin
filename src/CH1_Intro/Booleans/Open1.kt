package CH1_Intro.Booleans

// && : 논리곱. 연산자 오른쪽과 왼쪽에 있는 Boolean 식이 모두 true일 때만 true를 돌려준다.
fun isOpen1(hour: Int) {
    val open = 9
    val closed = 20
    println("Operating hours: $open - $closed")
    val status =
        if (hour >= open && hour <= closed)
            true
        else
            false
    println("Open : $status")
}

fun main() = isOpen1(6)