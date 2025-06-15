package CH2_Object.CreatingClasses

/*
    개발자(사용자)는 클래스를 정의함으로써 새로운 객체 타입을 정의할 수 있다.
    코틀린에서는 class라는 키워드를 사용해 새로운 유형의 객체를 만들 수 있다.
    더 복잡한 클래스를 정의할 때는 중괄호를 사용해서 클래스의 특성이나 행동 양식을 포함하는 클래스 본문을 정의한다.
 */

// class 정의
class Giraffe
class Bear
class Hippo

fun main() {
    // 객체 생성
    val g1 = Giraffe()
    val g2 = Giraffe()
    val b = Bear()
    val h = Hippo() // 클래스명()을 호출하여 만든 객체는 각각의 고유한 정체성을 가진다.
}