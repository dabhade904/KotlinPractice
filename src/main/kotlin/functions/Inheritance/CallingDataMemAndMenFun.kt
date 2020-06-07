package functions.Inheritance

open class Parent(){
    open  var num:Int=100

    open fun demo(){
        println("demo function of parent class")
    }
}

class Child:Parent(){
    override var num: Int=101
    override fun demo() {
        super.demo()
        println("demo function of child class")
    }

    fun demo1(){
        println("super  ${super.num}")
    }
}

fun main(args:Array<String>){
    var obj=Child()
    obj.demo()
    obj.demo1()
}
