// Day 04: Loops (for, while, ranges)
fun main() {
    println("=== ৭ এর নামতা ===")
    for (i in 1..10) {
        println("7 × $i = ${7 * i}")
    }

    println("\n=== ১ থেকে ১০০ যোগফল ===")
    var sum = 0
    for (i in 1..100) {
        sum += i
    }
    println("যোগফল: $sum")

    println("\n=== জোড় সংখ্যা (১-২০) ===")
    for (i in 2..20 step 2) {
        print("$i ")
    }
    println()
}
