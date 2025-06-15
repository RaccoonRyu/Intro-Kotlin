package CH2_Object.CreatingClasses

/*
    멤버 함수 : 클래스 본문 안에 정의된 함수
    * 멤버 함수를 메서드 라고 부르기도 하지만, 코틀린에서는 함수라는 표현을 주로 사용한다.
 */
class Dog {
    fun bark() = "yip!"
}

fun main() {
    val dog = Dog()
}