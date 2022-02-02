package functions

class NullableFunctionEx {
}

fun main(args: Array<String>) {
   val sent = null
    println(sent)


    val str:String? = "Hello World"
      if (str!=null) println(str.length) else  println(-1)


}

fun add(number: Int):Int? {
    val message:String? = null
    return number+number
}