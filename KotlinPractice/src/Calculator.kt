
enum class Symbols{
    ADD,MULTIPLY,SUBTRACT,DIVIDE,ERROR
}

object SymbolsFactory{
    fun create(type:Symbols): String {

        val name = when(type){
            Symbols.ADD ->"+"
            Symbols.MULTIPLY -> "*"
            Symbols.SUBTRACT -> "-"
            Symbols.DIVIDE -> "/"
            Symbols.ERROR -> "enter symbol"
        }
        return when(type){
            Symbols.ADD -> calculateValues(2.0,3.0,name)
            Symbols.MULTIPLY -> calculateValues(2.0,3.0,name)
            Symbols.SUBTRACT -> calculateValues(2.0,3.0,name)
            Symbols.DIVIDE -> calculateValues(2.0,3.0,name)
            Symbols.ERROR -> "enter again"
        }

    }
}

 val ADD ="+"
 val MULTIPLY = "*"
 val SUBTRACT = "-"
 val DIVIDE = "/"
 val ERROR = "enter symbol"


fun calculateValues(optionOne:Double,optiontwo:Double, symbol: String ): String {

    return when(symbol){
        ADD -> (optionOne+optiontwo).toString()
        MULTIPLY -> (optionOne*optiontwo).toString()
        SUBTRACT -> (optionOne-optiontwo).toString()
        DIVIDE -> (optionOne/optiontwo).toString()
        ERROR -> "enter symbol"
        else -> "wrong values"

    }

}


 class Calculator {

    fun add(valueOne: Double, valueTwo: Double):Double = valueOne + valueTwo

    fun subtract(valueOne: Double, valueTwo: Double):Double = valueOne - valueTwo


    fun multiply(valueOne: Double, valueTwo: Double):Double = valueOne * valueTwo


    fun divide(valueOne: Double, valueTwo: Double):Double = valueOne / valueTwo




}

fun main(){

    val calculator = Calculator()

   // println(calculator.add(2.0,3.0))
   // println(calculateValues(2.0,3.0,"*"))

    val entity = SymbolsFactory.create(Symbols.SUBTRACT)


    println(entity)


}