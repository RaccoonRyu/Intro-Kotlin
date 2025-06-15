package CH2_Object.Properties

/*
    프로퍼티 : 클래스에 속한 식별자. 클래스 안에서 상태를 유지한다.
    var 프로퍼티는 재 대입이 가능하지만, val 프로퍼티는 재 대입이 불가하다.
    클래스 안에 정의한 프로퍼티는 점 표기법을 사용하여 해당 프로퍼티 값에 접근할 수 있다.
*/
class Cup {
    var percentFull = 0
}

fun main() {
    val c1 = Cup()
    c1.percentFull = 50
    val c2 = Cup()
    c2.percentFull = 100
    println(c1.percentFull)
    println(c2.percentFull)
}