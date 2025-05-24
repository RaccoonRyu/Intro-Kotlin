package CH1_Intro.NumberTypes

fun bmiEnglish(
    weight: Int,
    height: Int
): String {
    val bmi =
        weight / (height * height) * 703.07 // 정수를 다른 정수로 나누면 정수를 돌려준다.
        // 정수 나눗셈에서 나머지를 처리하는 일반적인 방법은 버림이다.
        // 따라서 해당 함수에서 weight는 어떤 값을 입력하든 0이 되기 때문에, 703.07은 계산 식의 앞에서 곱해야 한다.
        // 만약 703.07을 계산 식의 앞에서 곱하면 weight는 강제 Double로 강제 형변환된다.
    return if (bmi < 18.5) "Underweight"
      else if (bmi < 25) "Normal weight"
      else "Overweight"
}

fun main() {
    val weight = 160
    val height = 68
    val status = bmiEnglish(weight, height)
    print(status)
}