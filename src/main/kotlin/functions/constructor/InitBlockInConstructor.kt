package functions.constructor

fun main(args: Array<String>) {
    val stu=Student2("SACHIN",25)
    val stu1=Student2("DABHADE")
    val stu2=Student2()
}

class Student2(val name: String = "Student", var age: Int = 99) {
    val stuName: String
    var stuAge: Int

    init {
        if(name=="Student"){
            stuName="NA"
            stuAge=0
        }
        else{
            stuName=name.toLowerCase()
            stuAge=age
        }
        println("Student name is : $stuName")
        println("Student age is : $stuAge")
    }
}