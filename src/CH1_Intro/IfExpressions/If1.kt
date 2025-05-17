package CH1_Intro.IfExpressions

// 코틀린에서 참/거짓을 판단할 때는 Boolean 타입을 사용한다.
// if 키워드는 식을 검사해 그 값이 참/거짓 중 어느 것인지 알아내고, 그 결과에 따라 작업을 수행한다.
fun main() {
    if(1 > 0) {
        println("It's true!")
    }

    if(10 < 11) {
        println("10 < 11")
        println("ten is less than eleven")
    }
    // if 뒤에 있는 괄호 안의 식은 true/false로 평가되어야 한다.
    // 식을 평가한 결과가 true인 경우 바로 다음에 있는 식이 실행되고, 코드가 여러 줄이라면 중괄호 안에 넣으면 돈다.
 }