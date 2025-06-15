package CH2_Object.ObjectsEverywhere
/*
    클래스 : 새로운 데이터 타입의 기초가 될 프로퍼티와 함수를 정의한다. 사용자 정의 타입이라 부르기도 한다.
    멤버 : 클래스에 속한 프로퍼티나 함수
    멤버 함수 : (함수 안에 정의되며) 특정 클래스에 속한 객체가 있어야만 사용할 수 있는 함수
    객체 생성 : 클래스에 해당하는 val이나 var 값을 만드는 과정. 클래스의 인스턴스를 생성한다고 말하기도 한다.

    클래스는 상태/행동을 정의하기 때문에 Double이나 Boolean 같은 내장 타입의 값도 인스턴스라는 용어를 사용하여 가리킬 수 있다.
 */
fun main() {
    val r1 = IntRange(0, 10)
    val r2 = IntRange(5, 7) // IntRange 클래스에 속하는 두 객체를 생성
    println(r1)
    println(r2)
}