package CH1_Intro.Functions

fun sayHello() { // 의미 있는 결과를 제공하지 않는 함수 반환 타입은 Unit이다. (생략되어 있음)
    println("Hallo!")
}

fun sayGoodBye(): Unit { // 해당 함수처럼 Unit은 명시할 수 있지만, 위 sayHello 함수처럼 생략해도 된다.
    println("Auf Wiedersehen!")
}

fun main() {
    sayHello()
    sayGoodBye()
}