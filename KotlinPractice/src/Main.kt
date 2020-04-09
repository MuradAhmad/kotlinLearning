/*
// variables
val name: String ="murad"
var greeting: String = "Hello"

//Functions
fun sayHello():String{

    return "hello"
}
fun sayHi():String = "hello"

fun sayH() = "hello"
fun hi(greetings:String, listItems: List<String> ){
    listItems.forEach { item ->  println("$greetings :$item ")}
}

fun say(greetings:String,  vararg greetingsItem: String ){
    greetingsItem.forEach { item ->  println("$greetings :$item ")}

}*/

fun main(){

    val person = Person()

    person.printInfo()

    //println(name)

    //println(greeting)

    //println(sayH())
   // println(hi("murad","ahmad"))

// array, List , map

  //  val myArray = arrayOf("murad","ahmad", "khan")
  //  say("hi", * myArray)


  //  val myList = listOf("murad","ahmad", "khan")
   // hi("hello",myList)

   // val myList = mutableListOf("murad","ahmad", "khan")
    //myList.add("jalal")

    // for(items in myArray)
    //    println(items)
    //println(items[1])

    //myArray.forEach { items -> println(items) }
 //   myArray.forEachIndexed { index, items -> println("each element at $index is $items ") }

 //   val map = mapOf(1 to "a", 2 to "b", 3 to "c")
  //  map.forEach { key, value -> println("$key -> $value")  }
   // val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
   // map.put(4,"d")
    //map.forEach { key, value -> println("$key -> $value")  }




}