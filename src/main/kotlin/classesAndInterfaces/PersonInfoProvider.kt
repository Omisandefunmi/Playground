interface PersonInfoProvider {
    val informant : String //properties can not be initialized in interfaces
    fun printInfo(person: Person){
        println(informant)
        person.printInfo()
    }  //Kotlin allows interfaces to provide default implementation
}

open class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider {
    override val informant: String
        get() = "Basic information Provider"

    override fun printInfo(person : Person){
        super.printInfo(person)
        println("more details")
    }
}

interface SessionInfoProvider{
    fun printSession(){
        println("Session printed")
    }
}

fun checkTypes(check: PersonInfoProvider){
    if (check is SessionInfoProvider){
        println("is a sessionInfoProvider")
        check.printSession()
    }
    else println("is not a session info provider")
}

fun main() {
    val samplePerson = Person()
    val infoProvider = BasicInfoProvider()

    infoProvider.printInfo(samplePerson)
    checkTypes(infoProvider)
}