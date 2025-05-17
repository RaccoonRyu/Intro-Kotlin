package StringTemplates

fun main() {
    val answer = 42
    println("Found $answer") // 식별자 앞에 $를 붙이면 문자열 템플릿이 그 식별자의 내용을 String에 넣어준다.
    println("printing a $1") // $ 다음에 오는 대상이 프로그램 식별자로 인식되지 않으면 아무 일도 일어나지 않는다.
}