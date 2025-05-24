package CH1_Intro.RepWithWhile

// do-while문
fun condition2(i: Int) = i < 100

fun main() {
    var i = 0
    do {
        print(".")
        i += 10
    } while (condition2(i)) // do-while : while문의 조건식이 false를 반환해도 본문이 최소 한 번은 실행된다.
}