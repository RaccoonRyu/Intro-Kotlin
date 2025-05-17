package CH1_Intro.VarAndVal

fun main() {
    // var 키워드에 저장된 값은 달라질 수 있다.
    // 즉, var에 저장된 데이터를 변경할 수 있다는 뜻이다.
    // 따라서 var 변수를 가변 이라고 한다.
    var sum = 1
    sum = sum + 2
    sum += 3
    println(sum) // 6 출력
}