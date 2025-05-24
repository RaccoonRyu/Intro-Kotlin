package CH1_Intro.LoopAndRange

// for loop를 써서 String의 각 문자에 대한 이터레이션을 직접 수행할 수 있다.
fun main() {
    for (ch in "Jnskhm ") { // ch에는 문자열에 들어있는 문자가 차례대로 전달된다.
        print(ch + 1)
    }
}