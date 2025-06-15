package CH2_Object.CreatingClasses

/*
    멤버 함수를 호출할 때는 객체 이름 다음에 점과 함수 이름, 파라미터 목록을 나열한다.
 */
class Cat {
    fun meow() = "mrrrow!"
}

fun main() {
    val cat = Cat()
    val m1 = cat.meow() // Cat 타입 객체 cat이 meow()를 호출한다.
    println(m1)
}