
// variables
val name: String ="murad"
var greeting: String = "Hello"

//Functions
fun sayHello():String{

    return "hello"
}
fun sayHi():String = "hello"

fun sayH() = "hello"
fun hi(str:String, str1: String ) = println("$str $str1")


fun main(){

    //println(name)

    //println(greeting)

    //println(sayH())
    println(hi("murad","ahmad"))

// array, List

    val myArray = arrayOf("murad","ahmad", "khan")

    val myList = listOf("murad","ahmad", "khan")

    // for(items in myArray)
    //    println(items)
    //println(items[1])

    //myArray.forEach { items -> println(items) }
    myArray.forEachIndexed { index, items -> println("each element at $index is $items ") }





}