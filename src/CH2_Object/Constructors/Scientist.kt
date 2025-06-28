package CH2_Object.Constructors

class Scientist(val name: String) {
    // 디폴트 toString이 아닌 재정의(오버라이딩)한 toString
    // override : 이미 정의된 메서드의 정의를 대신할 새 정의를 의미하는 키워드
    override fun toString(): String {
        return "Scientist('$name')"
    }
}

fun main() {
    val zeep = Scientist("Zeep Xanflorp")
    println(zeep)
}