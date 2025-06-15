package CH2_Object.Properties

class Sofa {
    val cover: String = "Loveseat cover"
}

fun main() {
    var sofa = Sofa()
    // sofa.cover = "New cover"는 허용되지 않는다.
    sofa = Sofa() // var이기 때문에 재 대입이 가능하다.
}