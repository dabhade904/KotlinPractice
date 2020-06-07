package functions.constructor

fun main(args :Array<String>){
    val obj=Student3("Dabhade",26)
}

class Student3{
    constructor(name:String,age:Int){
        println("Student name : ${name.toUpperCase()}")
        println("Student age : ${age}")
    }
}