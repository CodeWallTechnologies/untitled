package functions

class DefaultAndNamed {

}

fun main(args: Array<String>) {
sum1(14,16)
    sum(number2 = 47)
}

fun sum(number1: Int=23, number2: Int=17) {
    println(number1+number2)
}
fun sum1(number1: Int, number2: Int) {
    println(number1+number2)
}

