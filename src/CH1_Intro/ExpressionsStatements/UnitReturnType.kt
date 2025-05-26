package CH1_Intro.ExpressionsStatements

fun unitFun() = Unit // 모든 함수 호출 코드는 식이다.
// 위와 같이 함수가 Unit을 반환하고 부수 효과를 목적으로 호출되더라도 여전히 함수 호출 결과를 변수에 대입할 수 있다.

fun main() {
    println(unitFun())
    val u1: Unit = println(42) // Unit으로 명시적 선언
    println(u1)
    val u2 = println(0) // Unit으로 타입 추론
    println(u2)
    // Unit 타입에는 오직 Unit이라는 값만 포함된다. 따라서 직접 Unit값을 반환할 수 있다.
    // println()을 호출해도 Unit을 반환한다.
}