package IfExpressions

// if문으로 함수 만드는 예제
fun trueOrFalse(exp: Boolean): String {
    if(exp)
        return "It's true!"
    return "Its false!"
    // return : 함수를 종료하고 문장 다음의 값을 함수의 결괏값으로 생성
}

fun main() {
    val b = 1
    println(trueOrFalse(b < 3))
    println(trueOrFalse(b >= 3))
}