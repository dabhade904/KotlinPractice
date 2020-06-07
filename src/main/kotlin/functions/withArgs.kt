package functions

fun main(args : Array<String>){
    println("Sum : ${sum(30,20,30,40)}")
}

fun sum(vararg num:Int):Int{
    var sum =0
    num.forEach { number-> sum+=number }
 return sum
}