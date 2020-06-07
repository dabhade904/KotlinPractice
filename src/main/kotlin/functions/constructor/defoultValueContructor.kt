package functions.constructor

fun main(args:Array<String>){
    val stu=Student1("sachin",25)
    val stu1=Student1("dabhade")
    val stu2=Student1()

    println("name : ${stu.name} and Age : ${stu.age}")
    println("name : ${stu1.name} and Age : ${stu1.age}")
    println("name : ${stu2.name} and Age : ${stu2.age}")
}

class Student1(val name: String="Student", var age: Int=99){

}