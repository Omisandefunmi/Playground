val name = "olufunmi"
var greeting: String? = null

fun main() {
    greeting = "hello"
    when(greeting){
        null -> println("Hi")
        else -> println(greeting)
    }
    println(name)

//    if(greeting != null) {
//        println(greeting)
//    }

    var greetingToPrint = if(greeting != null) greeting else "Hi"
    println(greetingToPrint)
    println(name)
}