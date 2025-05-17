package CH1_Intro.VarAndVal
/*
    식별자
    - 프로그램을 이루는 요소를 가리키기 위해 사용
    - 데이터를 가리키는 식별자를 사용할 때는 식별자가 가리키는 내용이 프로그램을 실행하는 동안 변할 수 있는지/단 한 번만 값을 지정할 수 있는지를 선택해야 함
 */
fun main() {
    // val : 식별자의 값을 단 한 번만 초기화할 수 있는 키워드. 값을 초기화하고 나면 내용을 변경할 수 없다.
    // val 식별자 = 초기화할 값 으로 정의한다.
    // 값을 초기화하고 나면 내용을 변경할 수 없으므로, val 키워드를 불변이라고 한다.
    val whole = 11
    //whole = 15 // Val cannot be reassigned 에러 발생
    val frac = 1.4
    val word = "Twas"
    println(whole)
    println(frac)
    println(word)
}