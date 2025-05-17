package Functions

fun main () {
    println(multipleByThree(5))
}

// 함수 본문이 하나의 식으로마 이뤄진 경우 아래와 같이 등호(=) 뒤에 식을 넣어서 함수를 짧게 작성할 수 있다.
// fun 함수명(p1: 타입1, p2: 타입2, ...): 반환타입 = 식
// 함수 본문이 중괄호로 둘러싸인 경우를 블록 본문, 등호 뒤에 식이 본문으로 지정된 경우를 식 본문이라고 한다.
fun multipleByThree(x: Int): Int = x * 3