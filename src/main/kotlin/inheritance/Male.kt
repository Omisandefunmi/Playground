package inheritance

class Male: Human() {
    override fun talk(){
        super.talk()
        println("$firstName $lastName talks like a male too")
    }
}