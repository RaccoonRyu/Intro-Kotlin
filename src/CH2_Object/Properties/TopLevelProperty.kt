package CH2_Object.Properties

/*
    최상위 수준 프로퍼티에 val을 정의하는 것은 안전하지만 가변 상태인 var를 정의하는 것은 안티 패턴이다.
    따라서 가변 상태는 클래스 안에 가두는 것이 가장 좋다.
*/
val constant = 42

var counter = 0

fun inc() {
    counter++
}