// Day 05: Functions
fun square(n: Int) = n * n
fun add(a: Int, b: Int) = a + b
fun multiply(a: Int, b: Int) = a * b
fun isEven(n: Int) = n % 2 == 0
fun greet(name: String) = "স্বাগতম, $name!"

fun main() {
    println("square(6) = ${square(6)}")
    println("add(5, 3) = ${add(5, 3)}")
    println("multiply(4, 6) = ${multiply(4, 6)}")
    println("isEven(10) = ${isEven(10)}")
    println(greet("আজিজুল"))
}
