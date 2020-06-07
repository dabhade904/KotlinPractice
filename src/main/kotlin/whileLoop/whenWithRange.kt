package whileLoop

fun main(args:Array<String>){
    val num=4

    when(num){
        in 1..10 -> println("$num is a single digit number");
        in 10..100 -> println("$num is a two digit number");
        in 100..999 -> println("$num is a three digit number");

        else -> println("$num is more  than three digit number");
    }
}