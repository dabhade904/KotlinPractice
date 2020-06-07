fun main(args : Array<String>){
    var str= "sachin"
    println("3rd index: ${str.get(3)}")
    println("4th index: ${str[4]} ")

    /**
     * Here fromIndex is inclusive and
     * toIndex is exclusive which means
     * 5th index char will not be included
     */
    println("index from 1 to 4 " +str.subSequence(0,6 ))


    var str1 = "beginnersbook.com"

    println("Contains .com: ${str1.contains(".com")}")

}