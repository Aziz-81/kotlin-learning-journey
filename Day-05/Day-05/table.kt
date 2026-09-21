fun printTable(number: Int) {
    for (i in 1..10) {
        println("$number × $i = ${number * i}")
    }
}

fun main() {
    printTable(18)
}
