package CH1_Intro.LoopAndRange

// 이터레이션은 정수, 문자처럼 하나하나 값이 구분되는 양에 대해서만 가능 ex) 부동소수점 수에 대해서는 할 수 없다.
fun main() {
    for (c in 'a' .. 'z') {
        print(c)
    }
}