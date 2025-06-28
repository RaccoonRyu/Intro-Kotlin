package CH2_Object.Constructors
/*
    파라미터가 많은 생성자
 */
class AlienSpecies(
    val name: String,
    val eyes: Int,
    val hands: Int,
    val legs: Int
) {
    fun describe() = "$name with $eyes eyes, " + "$hands hands and $legs legs"
}

fun main() {
    val kevin = AlienSpecies("Zigerion", 2, 2, 2)
    val mortyJr = AlienSpecies("Gazorpian", 2, 6, 2)
    println(kevin.describe())
    println(mortyJr.describe())
}