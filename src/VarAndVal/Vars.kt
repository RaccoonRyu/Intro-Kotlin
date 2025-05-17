package VarAndVal
/*
    식별자
    - 프로그램을 이루는 요소를 가리키기 위해 사용
    - 데이터를 가리키는 식별자를 사용할 때는 식별자가 가리키는 내용이 프로그램을 실행하는 동안 변할 수 있는지/단 한 번만 값을 지정할 수 있는지를 선택해야 함
 */
fun main() {
    // var : 변할 수 있는 수. 내용을 재대입할 수 있다.
    // var 식별자 = 초기화할 값 으로 정의한다.
    var whole = 11
    var frac = 1.4
    var words = "Twas"
    println(whole)
    println(frac)
    println(words)
}