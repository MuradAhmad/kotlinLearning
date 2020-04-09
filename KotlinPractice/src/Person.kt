class Person(val firstName:String = "mur" ,val lastName:String = "ahm") {

    var nickName: String? = null
        set(value) {
            field = value
            println("the new nickName is $value")
        }
        get() {
            println("the returned  value is $field")
            return field
        }
    fun printInfo(){
        // val  nickNameToPrint = if (nickName != null) nickName else "ahmad"
        val  nickNameToPrint = nickName ?: "ahmad"
        println("$firstName $nickNameToPrint $lastName")
    }

}