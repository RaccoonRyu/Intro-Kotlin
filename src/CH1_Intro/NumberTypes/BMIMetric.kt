package CH1_Intro.NumberTypes

// 함수 파라미터를 한 줄에 쓸 수 없을 때 코드르 작성하는 형식을 보여주는 예제
fun bmiMetric(
    weight: Double,
    height: Double // 함수 파라미터를 여러 줄에 걸쳐 작성했다.
): String {
    val bmi = weight / (height * height)
    return if (bmi < 18.5) "Underweight"
        else if (bmi < 25) "Normal weight"
        else "Overweight"
}

fun main() {
    val weight = 72.57
    val height = 1.727
    val status = bmiMetric(weight, height)
    print(status)
}