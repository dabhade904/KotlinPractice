package functions

fun main(args: Array<String>) {
    var sum = { num1: Int, num2: Int ->
        num1 + num2
    }
        println("addtion of two number is = ${sum(5, 7)}")

}

