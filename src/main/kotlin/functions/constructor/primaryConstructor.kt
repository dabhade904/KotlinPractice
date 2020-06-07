package functions.constructor

fun main(args:Array<String>){
    val stu=Student("sachn",25)

    println("student name : ${stu.name}")
    println("student age : ${stu.age}")
}

class Student(val name: String, var age : Int){

}