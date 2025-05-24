package CH1_Intro.NumberTypes

// Long을 사용하여 Integer를 초과하는 값의 넘침을 방지할 수 있다.
fun main() {
    val i = Int.MAX_VALUE
    println(0L + i + i)
    println(1_000_000 * 1_000_000L)
}