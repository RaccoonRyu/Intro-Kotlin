package StringTemplates

fun main() {
    val s = "value"
    println("s = \"$s\".") // String 안에 큰 따옴표 등의 특수 문자를 넣어야 하는 경우에는 역슬래시(\)를 사용하여 escape 하거나
    println("""s = "$s".""") // 큰 따옴표를 연달아 세 개 쓰는 String 리터럴을 사용해야 한다.
    // 큰 따옴표 세 개를 쓸 때도 큰 따옴표를 하나만 쓰는 문자열과 마찬가지로 $식별자나 ${식}을 사용해 식의 값을 삽입할 수 있다.
}