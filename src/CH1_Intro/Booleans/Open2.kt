package CH1_Intro.Booleans

fun isOpen2(hour: Int) {
    val open = 9
    val closed = 20
    println("Operating hours : $open - $closed")
    val status = hour >= open && hour <= closed // if 식 중 조건만 사용하여 if 식을 단순화 할 수 있다.
    println("Open : $status")
}