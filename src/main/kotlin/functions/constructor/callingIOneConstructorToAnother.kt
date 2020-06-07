package functions.constructor

fun main(args: Array<String>) {
    val obj = Student4("sachin")
}

class Student4 {
    constructor(name: String) : this(name, 0) {
        println("secondary constructor with one param")
    }

    constructor(name: String, age: Int) {
        println("secondary construtor with two param")
        println("Student name : ${name.toUpperCase()}")
        println("Student age : ${age}")
    }
}


