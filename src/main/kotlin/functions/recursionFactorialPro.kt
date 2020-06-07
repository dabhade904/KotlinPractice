fun main(args: Array<String>) {
    println("enter a positive number")
    val number: Int = Integer.valueOf(readLine())
    val factorial = fact(number)
    println("Factorial of $number = $factorial")

}

fun fact(num: Int): Int {
    return if (num == 1) {
        num
    } else {
        num * fact(num - 1)
    }
}
