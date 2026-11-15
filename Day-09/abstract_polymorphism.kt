// Day 09: Polymorphism and Abstract Class
// আজিজুল ইসলাম

abstract class Document(val title: String, val content: String) {
    abstract fun format(): String
    
    fun showInfo() {
        println("📄 ডকুমেন্ট: $title")
        println("📁 ফরম্যাট: ${format()}")
        println("---------------------------")
    }
}

class WordDocument(title: String, content: String) : Document(title, content) {
    override fun format() = "Word (.docx)"
}

class PDFDocument(title: String, content: String) : Document(title, content) {
    override fun format() = "PDF (.pdf)"
}

fun main() {
    val myDocs = listOf(
        WordDocument("প্রশ্নপত্র", "১. প্রশ্ন"),
        PDFDocument("নোটস", "২. নোট")
    )
    
    for (doc in myDocs) {
        doc.showInfo()
    }
}
