package CH1_Intro.ExpressionsStatements

// if는 식을 만들 수 있다. 따라서 if의 결과를 변수에 대입할 수 있다.
fun main() {
    val result1 = if (11 > 42) 9 else 5
    val result2 = if (1 < 2) {
        val a = 11
        a + 42 // a는 해당 코드 블럭에서만 접근할 수 있다.
    } else 42

    val result3 =
        if('x' < 'y')
            println("x < y")
        else
            println("x > y")

    println(result1)
    println(result2)
    println(result3)
}