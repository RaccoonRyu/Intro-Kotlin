package CH1_Intro.LoopAndRange

// 각 괄호([숫자])를 사용하여 숫자 인덱스를 통해 문자열의 문자에 접근
fun main() {
    val s = "abc"
    for (i in 0 .. s.lastIndex) {
        print(s[i] + 1)
    }
}