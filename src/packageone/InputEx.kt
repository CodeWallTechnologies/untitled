package packageone

import java.util.*

class InputEx {
}

fun main(args: Array<String>) {
    println("Enter your name")
    val name = readln()
    println(name)


    println("Enter your age")
    val age: Int = readln().toInt()
    println(age)


    println("Enter your id")
    val scanner = Scanner(System.`in`)
    val id = scanner.nextInt()
    println(id)

}

