package inheritance

open class Human(val firstName: String = "Human", val lastName: String = "Being"){
   open fun talk(){
        println("$firstName $lastName talks like a human")
    }
}