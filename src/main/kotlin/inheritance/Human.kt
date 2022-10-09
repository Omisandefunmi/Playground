package inheritance

open class Human(var firstName: String = "Human", var lastName: String = "Being"){
   open fun talk(){
        println("$firstName $lastName talks like a human")
    }
}