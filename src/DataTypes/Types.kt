package DataTypes

fun main() {
    val whole: Int = 11 // 정수
    val frac: Double = 1.4 // 실수
    val trueOrFalse: Boolean = true // 논리형
    val words: String = "A Value" // 문자열
    val chars: Char = 'z' // 문자
    val lines: String = """Triple quotes let 
    you have many lines
    in yours string"""
    // 문자열(로 문자열) -> 큰 따옴표 세 개로 문자열을 감싸면 여러 줄에 걸친 문자열을 만들거나 특수 문자가 들어간 문자열을 만들

    println(whole)
    println(frac)
    println(trueOrFalse)
    println(words)
    println(chars)
    println(lines)
}