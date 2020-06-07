fun main(args : Array<String>){
    println("number range")

    for(num in 1..4){
        println(num)
    }
    println()
    println("Character range A to Z")

    for(ch in 'a'..'d'){
        println(ch)
    }

    println()
    var oneToTen= 1..10
    println("3 in one to ten : ${3 in oneToTen}")
    println()
    println("11 in one to ten : ${11 in oneToTen}")
    println()

    val onToFive=1.rangeTo(5)
    val sixToThree=6.downTo(3)

    println("rangeTo")
    for(x in onToFive){
        println(x)
    }
    println()
    
    println("downTo")

    for(z in sixToThree){
        println(z)
    }
}