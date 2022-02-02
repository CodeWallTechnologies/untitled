package functions

class LambdaExpression {
}

fun main(args: Array<String>) {
   val result = total(1,2)
    println(result)
}


val sum1 = {a:Int , b:Int -> a+b}
val total:(Int,Int)->Int = {a,b->a+b}