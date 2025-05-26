package CH1_Intro.ExpressionsStatements

// 식과 문
// 문은 효과를 발생시키지만 결과를 내놓지 않는다. - 주로 상태를 변경(부수 효과를 얻는다고 표현)한다.
// 식은 항상 결과를 만들어낸다. - 결과 값을 만들어낸다.
// 식은 값을 돌려주기 때문에 이 값을 변수에 대입하거나 다른 식의 일부분으로 쓸 수 있다.
// 반면에 문은 다른 식의 일부분이 되거나 변수에 대입할 수 없는 최상위 요소다.

fun main() {
    // for문은 문이기 때문에 아무런 결과 값도 만들어내지 않아 for문을 다른 변수에 대입할 수 없다.
    // 아래와 같이 할 수는 없다.
    // val f = for(i in 1 .. 10) {}
    // 컴파일러 오류 메시지: for is not an expression, and only expressions are allowed here
}