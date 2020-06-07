package functions.constructor

//In the following example we have two classes College which is a parent class and a child class Student. Here the child class
// secondary constructor is calling the parent class secondary constructor using the super keyword.
fun main(args: Array<String>) {
    val stu = Student5("harray", 44)

}

open class College {
    constructor(name: String, age: Int) {
        println("parent class constructor")
        println("Students name : ${name.toUpperCase()}")
        println("Students age : ${age}")
    }
}

class Student5 : College {
    constructor(name:String,age:Int):super(name,age ){
        println("Child class constructor")
        println("Student name : ${name.toUpperCase()}")
        println("Student age : ${age}")
    }
}