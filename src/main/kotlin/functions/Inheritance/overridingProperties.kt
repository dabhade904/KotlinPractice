package functions.Inheritance

//We can override the property of base class, similar to what we have seen above for member function. In the following example we have a
// property colour in the parent class and we are overriding it in the child class.
open class Animalss{
    open  var colour : String="White"
}

class Dog2:Animalss(){
    override var colour: String="black"
    fun sound(){
        println("dog make sound of woof woof")
    }
}

fun main(args :Array<String> ) {
    val d=Dog2()
    d.sound()
    println("${d.colour}")
}