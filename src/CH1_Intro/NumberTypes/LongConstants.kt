package CH1_Intro.NumberTypes

// 프로그램이 큰 수를 저장해야 한다면 Long을 쓸 수 있다.
// Long 타입의 val을 정의하고 싶으면 수 리터럴 뒤에 L을 붙여서 해당 리터럴을 Long 타입으로 다뤄야 함을 코들린에 명시한다.
fun main() {
    val i = 0 // Int 타입 추론
    val l1 = 0L // L을 사용해 Long 타입으로 사용함을 명시
    val l2: Long = 0 // Long을 사용하여 명시적으로 타입 지정
    println("$l1 $l2")
}