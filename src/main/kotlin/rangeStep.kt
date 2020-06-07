fun main(args : Array<String>){
    val oneToTen=1..10
    val odd=oneToTen.step(2)

    for(n in odd){
        println(n)
    }

    println()
    println("in reverse order")
    for(n in oneToTen.reversed()){
        println(n)
    }
}