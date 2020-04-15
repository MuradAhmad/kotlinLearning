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

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {

   protected  open val sessionIdPrefix = "Session"

    override fun getSessionId(): String {
        return sessionIdPrefix
    }

    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
    }
}

fun main(){

    val provider = FancyInvokeProvider()
   // val provider = BasicInfoProvider()
    provider.printInfo(Person())

    checkTypes(provider)

}

fun checkTypes(infoProvider: SessionInfoProvider){
    if(infoProvider is SessionInfoProvider){
        println("is session Provider")

    }else {
        println(" is not a session provider")

    }
   //WE do not need to use explicit casting, therefore (infoProvider as SessionInfoProvider).getSessionId()
    //infoProvider.getSessionId()



}

