package CH1_Intro.LoopAndRange

fun hasChar(s: String, ch: Char): Boolean {
    for (c in s) {
        if (c == ch) return true // 해당 문장 실행 시 함수를 멈추고 참을 반환한다.
    }
    return false
}

fun main() {
    println(hasChar("kotlin", 't'))
    println(hasChar("kotlin", 'a'))
}
