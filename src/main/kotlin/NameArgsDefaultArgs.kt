fun greetPerson(greeting:String, name:String){
    println("$greeting $name!!!")
}

fun greetSomeone(greeting: String = "Hey", name: String = "Someone"){
    println("$greeting $name")
}

fun main() {
    //with named args arguments can be passed into functions in no particular order
    //the compiler will assign each value to its corresponding argument name
    greetPerson(name = "Naomi",greeting = "hello")
//    greetPerson(name = "mimi", "hi")

    //by providing default names, functions can be called with partial or no arguments at all
    //the compiler will use the default values for the unspecified args
    greetSomeone(name = "anyone")
    greetSomeone()
}