interface PersonInfoProvider {
    val providerInfo : String

    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId() : String
}

class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {

    override fun getSessionId(): String {
        return "Session"
    }

    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
    }
}

fun main(){

    val provider = BasicInfoProvider()
    provider.printInfo(Person())

    checkTypes(provider)

}

fun checkTypes(infoProvider: SessionInfoProvider){
    if(infoProvider is SessionInfoProvider){
        println("is session Provider")

    }else {
        println(" is not a session provider")

    }


}

