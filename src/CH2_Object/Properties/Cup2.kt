package CH2_Object.Properties

/*
    멤버 함수는 점 표기법을 사용하지 않고 자신이 속한 객체의 프로퍼티에 접근할 수 있다.
*/

class Cup2 {
    var percentFull = 0
    val max = 100
    fun add(increase: Int): Int {
        percentFull += increase
        if (percentFull > max) percentFull = max
        return percentFull
    }
}

fun main() {
    val cup = Cup2()
    cup.add(50)
    println(cup.percentFull)
    cup.add(70)
    println(cup.percentFull)
}