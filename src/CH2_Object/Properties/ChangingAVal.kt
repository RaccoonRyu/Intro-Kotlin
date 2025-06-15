package CH2_Object.Properties

class House {
    var sofa: String = ""
}

fun main() {
    val house = House()
    house.sofa = "Simple sleeper sofa: $89.00"
    println(house.sofa)
    house.sofa = "New leather sofa: $3,099.00"
    println(house.sofa)
    // val에는 새 하우스를 대입할 수 없다.
    // house = House() 불가!
}