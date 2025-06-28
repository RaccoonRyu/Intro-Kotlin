package CH2_Object.Constructors
/*
    클래스 본문 밖에서도 생성자 파라미터에 접근할 수 있게 하려면 파라미터 목록에 var나 val을 지정한다.
    생성자 파라미터 목록을 var나 val로 정의하면 해당 식별자가 프로퍼티로 바뀌며, 생성자 밖에서도 해당 식별자에 접근할 수 있게 된다.
 */

class MutableNameAlien (var name: String)
class FixedNameAlien(val name: String) // 암시적 클래스 본문

fun main() {
    val alien1 = MutableNameAlien("Reverse Giraffe")
    val alien2 = FixedNameAlien("Krombopolis Michael")
    alien1.name = "Parasite"
}