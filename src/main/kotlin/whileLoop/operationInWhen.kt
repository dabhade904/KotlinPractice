package whileLoop

fun main(args: Array<String>){
    var age=18

    when(age){
        in 1..17 ->{
            val num=18-age

            println("you will eligible for voting $num year")
        }
        in 18..100 -> println("you are eligible for voting");
    }
}