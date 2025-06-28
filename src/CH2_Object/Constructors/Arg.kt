package CH2_Object.Constructors

/*
    생성자에게 정보를 전달할 때는 파라미터 목록을 사용한다.
 */
class Alien(name: String) { // 인자를 하나 받는 Alien 생성자
    val greeting = "Poor $name!" // 이 name은 생성자 밖에서는 접근할 수 없다.
}

fun main() {
    val alien = Alien("Mr. Meeseeks") // Alien 객체를 생성하려면 인자를 하나 전달해야 한다.
    println(alien.greeting)
}