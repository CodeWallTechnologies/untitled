package functions

class FunctionExOne {

}

fun main(args: Array<String>) {
    display()
    name("Win Min Htet")
    println(total(1, 2))
}

fun display(){
    println("display method is working")
}

fun name(firstName: String){
    println("First name is $firstName")
}

fun total(number: Int,number1: Int):Int{
    return number+number1
}