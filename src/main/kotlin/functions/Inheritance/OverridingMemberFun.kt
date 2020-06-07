package functions.Inheritance

open class Animals {
    open fun sound() {
        println("Animal make a sound")
    }
}

class Dog1:Animals(){
    override fun sound() {
        println("Dog make sound of woof woof")
    }
}

fun main(args:Array<String>){
    val d=Dog1()
    d.sound()
}