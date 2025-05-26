package CH1_Intro.ExpressionsStatements

// 전위 연산자 vs 후위 연산자
// 전위 연산자 : ++i 처럼 피연산자 앞에 나오고 변수의 값을 먼저 증가(감소)시킨 값을 돌려준다.
// 후위 연산자 : i++ 처럼 피연산자 다음에 위치하며 변수의 값을 증가(감소)시키기 전에 i에 들어있던 값을 돌려준다.
// 전위/후위 연산자는 값을 만들어 내기 때문에 식이다.
fun main() {
    var i = 10
    println(i++)
    println(i)
    var j = 20
    println(++j)
    println(j)
}