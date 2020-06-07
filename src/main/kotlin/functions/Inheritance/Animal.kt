package functions.Inheritance

open class Animal(colour : String, age :Int){
    init {
        println("colour is : $colour")
        println("age is : $age")
    }
}

class Dog(colour: String,age: Int):Animal(colour, age){
    fun woof(){
        println("Dog make sound of woof")
    }
}

class Cat(colour: String,age: Int):Animal(colour, age){
    fun meow(){
        println("Cat makes sound of meow")
    }
}

class Horse(colour: String,age: Int):Animal(colour, age){
    fun neigh(){
        println("Horse makes sound neigh")
    }
}


fun main(args: Array<String>){
    val d=Dog("black",4)
    d.woof()

    val c=Cat("White",5)
    c.meow()

    val h=Horse("Brown",10)
    h.neigh()
}