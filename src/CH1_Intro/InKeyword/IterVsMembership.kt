package CH1_Intro.InKeyword

fun main() {
    val values = 1 .. 3
    for (v in values) { // in 키워드는 이터레이션과
        println("iteration $v")
    }
    val v = 2
    if (v in values) // 원소 여부 검사에 함께 사용한다.
        println("$v is a member of $values")
}