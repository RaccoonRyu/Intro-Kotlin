package CH2_Object.Constructors

fun main() {
    val krombopulosMichael = AlienSpecies("Gromflomite", 2, 2, 2)
    println(krombopulosMichael) // println()은 문자열 대신 객체를 전달받은 경우 객체의 toString()을 호출한 결과를 출력한다.
    // 이 때 클래스에 직접 toString()을 정의하지 않으면 디폴트 toString()이 호출된다.
}