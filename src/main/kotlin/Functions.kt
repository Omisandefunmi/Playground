fun getSubjects(): String{
    return "Maths"
}

fun getTeacherName(): String? {
    return null
}

fun printScores(): Unit{
    println("No score")
}
fun getStudent() = "Adam is a student"    //this is known as Single expression function, type inferences are supported for functions too

fun greetTeacher(title: String, teacherName: String){
    println( "Good day, $title $teacherName")
}
fun main() {
    println(getSubjects())
    println(getTeacherName())
    printScores()
    println(getStudent())
    greetTeacher("Mr", "Uche")
}