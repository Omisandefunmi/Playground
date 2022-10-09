class Person(var firstName: String = "king", var lastName: String = "oba") {
    init {
        println("New instance of person has been created")
    }
    var nickName: String? = null
        set(value) {
            field = value
        }
        get() {
            return field
        }

    fun printInfo(){
       val nickNameToPrint = nickName?.uppercase() ?: "$firstName has no nick name"
        println("""
            First Name: ${firstName.uppercase()}
            Last Name: ${lastName.uppercase()}
            Nick Name: $nickNameToPrint
        """.trimIndent())
    }
}

fun main() {
    val newPerson = Person("olu", "wale")
    val anotherPerson = Person()
    anotherPerson.nickName = "Aya oba"
   newPerson.printInfo()
    anotherPerson.printInfo()
}