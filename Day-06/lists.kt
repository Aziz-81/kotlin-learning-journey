// Day 06: Lists and Collections
// আজিজুল ইসলাম - ৫ অক্টোবর ২০২৬

fun main() {
    println("=== List Basics ===")
    val students = mutableListOf("আজিজুল", "রাহিম", "করিম", "সালাম")
    
    students.forEachIndexed { index, name ->
        println("${index + 1}. $name")
    }
    
    println("\n=== নতুন ছাত্র যোগ ===")
    students.add("ফাতিমা")
    students.add("আয়েশা")
    println("মোট ছাত্র: ${students.size} জন")
    
    println("\n=== 'আ' দিয়ে শুরু ===")
    val aStudents = students.filter { it.startsWith("আ") }
    aStudents.forEach { println("→ $it") }
    
    println("\n=== সব নাম বড় হাতের ===")
    val upperNames = students.map { it.uppercase() }
    println(upperNames)
    
    println("\n=== জোড় সংখ্যা (1-10) ===")
    val evens = (1..10).filter { it % 2 == 0 }
    println(evens)
    
    println("\n=== সংখ্যার বর্গ ===")
    val squares = listOf(1, 2, 3, 4, 5).map { it * it }
    println(squares)
    
    println("\n=== খরচের হিসাব ===")
    val expenses = listOf(250, 120, 500, 80, 350)
    println("মোট: ${expenses.sum()} টাকা")
    println("সর্বোচ্চ: ${expenses.maxOrNull()} টাকা")
    println("সর্বনিম্ন: ${expenses.minOrNull()} টাকা")
    println("গড়: ${expenses.average()} টাকা")
}
