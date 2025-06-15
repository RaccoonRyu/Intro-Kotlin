package CH2_Object.CreatingClasses
/*
    this : 멤버 함수 안에서 자신이 속한 객체의 참조에 접근하는 키워드
 */
class Hamster {
    fun speak() = "Squeak!"
    fun exercise() =
        this.speak() + // this로 한정함
                speak() + "Running on wheel" // this 없이 호출함
}

fun main() {
    val hamster = Hamster()
    println(hamster.exercise())
}