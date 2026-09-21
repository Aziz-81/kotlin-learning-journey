fun getGrade(marks: Int): String {
    return when (marks) {
        in 80..100 -> "A+"
        in 70..79  -> "A"
        in 60..69  -> "A-"
        in 50..59  -> "B"
        in 33..49  -> "C"
        in 0..32   -> "F"
        else       -> "Invalid"
    }
}

fun main() {
    println("85 → ${getGrade(85)}")
    println("72 → ${getGrade(72)}")
    println("45 → ${getGrade(45)}")
    println("25 → ${getGrade(25)}")
    println("110 → ${getGrade(110)}")
}
