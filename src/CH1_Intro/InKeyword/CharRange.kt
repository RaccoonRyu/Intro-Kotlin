package CH1_Intro.InKeyword

// in으로 어떤 문자가 문자 범위 안에 속하는지도 검사할 수 있다.
fun isDigit(ch: Char) = ch in '0' .. '9'

fun notDigit(ch: Char) = ch !in '0' .. '9' // !in은 어떤 값이 범위 안에 속하지 않으면 true를 돌려준다.

fun main() {
    println(isDigit('a'))
    println(isDigit('5'))
    println(notDigit('z'))
}