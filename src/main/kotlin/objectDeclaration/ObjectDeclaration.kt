package objectDeclaration

object InstantiateSomething{
    fun instantiate() = SomeThing("cup")
}
class SomeThing(var id: String){
    override fun toString(): String {
        return "id -> $id"
    }
}

fun main() {
    val anotherThing = InstantiateSomething.instantiate()
    println(anotherThing)
}