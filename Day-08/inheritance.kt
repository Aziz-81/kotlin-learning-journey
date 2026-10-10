// Day 08: Inheritance
// আজিজুল ইসলাম - ১০ অক্টোবর ২০২৬

open class Person(val name: String) {
    open fun introduce() {
        println("আমি $name")
    }
}

class Student(name: String, val grade: String) : Person(name) {
    override fun introduce() {
        println("আমি $name, গ্রেড $grade")
    }
}

class Teacher(name: String, val subject: String) : Person(name) {
    override fun introduce() {
        println("আমি $name, বিষয় $subject")
    }
}

open class Employee(
    val name: String,
    val id: Int,
    val baseSalary: Double
) {
    open fun calculateSalary(): Double = baseSalary
    
    open fun showInfo() {
        println("👤 নাম: $name")
        println("💰 বেতন: ${calculateSalary()} টাকা")
    }
}

class Manager(name: String, id: Int, baseSalary: Double, val bonus: Double) 
    : Employee(name, id, baseSalary) {
    override fun calculateSalary() = baseSalary + bonus
}

fun main() {
    println("=== Person Inheritance ===")
    val person = Person("সাধারণ মানুষ")
    val student = Student("আজিজুল", "A+")
    val teacher = Teacher("ড. রহমান", "গণিত")
    person.introduce()
    student.introduce()
    teacher.introduce()
    
    println("\n=== Employee Inheritance ===")
    val manager = Manager("আজিজুল ইসলাম", 101, 50000.0, 15000.0)
    manager.showInfo()
}
