package CH1_Intro.RepWithWhile

// while : 가장 기본적인 반복을 수행한다. while문은 조건식이 true인 동안 블록을 반복 수행한다.
fun condition(i: Int) = i < 100

fun main() {
    var i = 0
    while (condition(i)) {
        print(".")
        i += 10
    }
}