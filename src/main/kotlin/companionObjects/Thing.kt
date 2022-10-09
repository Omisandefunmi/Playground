package companionObjects
interface ProvideId{
    fun getId(): String
}

class Thing private constructor(var id: String){


    companion object ThingCreator: ProvideId{
        const val id = "id"
        override fun getId(): String {
            return "1234"
        }

        fun createThing() = Thing(getId())
    }

}

fun main(){
    val something = Thing.ThingCreator.createThing()
    if(something is Thing) println("Something is an instance of thing")
    else println("Something is not an instance of thing")
    println(something.id)
}