// Day 07: OOP Basics - Class and Object
// আজিজুল ইসলাম - ৬ অক্টোবর ২০২৬

class Student(val name: String, val age: Int) {
    fun introduce() {
        println("আমার নাম $name, বয়স $age")
    }
}

class Book(
    val title: String,
    val author: String,
    var isAvailable: Boolean = true
) {
    fun showInfo() {
        val status = if (isAvailable) "✅ পাওয়া যাচ্ছে" else "❌ ধার দেওয়া হয়েছে"
        println("📖 $title - $author  $status")
    }
    
    fun borrow() {
        if (isAvailable) {
            isAvailable = false
            println("📚 '$title' ধার নেওয়া হয়েছে")
        } else {
            println("⚠️ '$title' এখন পাওয়া যাচ্ছে না")
        }
    }
    
    fun returnBook() {
        isAvailable = true
        println("✅ '$title' ফেরত দেওয়া হয়েছে")
    }
}

fun main() {
    println("=== Student Class ===")
    val s1 = Student("আজিজুল", 31)
    val s2 = Student("রাহিম", 25)
    s1.introduce()
    s2.introduce()
    
    println("\n=== লাইব্রেরির বই ===")
    val book1 = Book("প্রোগ্রামিং ইন কটলিন", "Google")
    val book2 = Book("বাংলা ব্যাকরণ", "ড. মুহম্মদ শহীদুল্লাহ")
    book1.showInfo()
    book2.showInfo()
    
    println("\n=== বই ধার ===")
    book1.borrow()
    book1.showInfo()
    
    println("\n=== আবার ধার চেষ্টা ===")
    book1.borrow()
    
    println("\n=== বই ফেরত ===")
    book1.returnBook()
    book1.showInfo()
}
