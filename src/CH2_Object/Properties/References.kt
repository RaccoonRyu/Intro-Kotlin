package CH2_Object.Properties

class Kitchen {
    var table: String = "Round table"
}

fun main() {
    val kitchen1 = Kitchen()
    val kitchen2 = kitchen1
    println("kitchen1 : ${kitchen1.table}")
    println("kitchen2 : ${kitchen2.table}")
    kitchen1.table = "Square table"
    println("kitchen1 : ${kitchen1.table}")
    println("kitchen2 : ${kitchen2.table}")
    // var와 val은 참조를 제한한다.
    // var를 사용하면 참조가 가리키는 대상을 다른 대상으로 다시 엮을 수 있다.
    // 반면에 val을 사용하면 다른 대상을 엮을 수 없다.
    // 즉 내부 프로퍼티를 var로 정의한 객체는 불변 객체, val로 정의한 객체는 불변 객체로 정의한다.
}