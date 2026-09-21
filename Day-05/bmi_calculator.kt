fun calculateBMI(weight: Double, height: Double): Double {
    return weight / (height * height)
}

fun getBMICategory(bmi: Double): String {
    return when {
        bmi < 18.5 -> "কম ওজন"
        bmi < 25.0 -> "স্বাভাবিক"
        bmi < 30.0 -> "অতিরিক্ত ওজন"
        else       -> "স্থূলতা"
    }
}

fun main() {
    val bmi = calculateBMI(70.0, 1.75)
    println("BMI: ${"%.2f".format(bmi)}")
    println("শ্রেণী: ${getBMICategory(bmi)}")
}
