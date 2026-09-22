// Day 03: Conditions (if-else, when)
fun main() {
    val marks = 85

    println("=== Grade Calculator ===")
    when (marks) {
        in 80..100 -> println("Grade: A+")
        in 70..79  -> println("Grade: A")
        in 60..69  -> println("Grade: A-")
        in 50..59  -> println("Grade: B")
        in 33..49  -> println("Grade: C")
        in 0..32   -> println("Grade: F")
        else       -> println("Invalid number")
    }
}
