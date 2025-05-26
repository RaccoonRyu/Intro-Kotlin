package CH1_Intro.ExpressionsStatements

// 혼동을 야기할 수 있어 다른 식 안에 부분 식으로 증가 연산자나 감소 연산자를 사용하는 것은 권장하지 않는다.
fun main() {
    var i = 1
    println(i++ + ++i)
    // 윗 줄 보다는 덜 복잡 하지만 바람직 한 코드는 아닌..
    println(i++ + 10)
    println(20 * ++i)
}