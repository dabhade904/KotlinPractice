fun main(args : Array<String>){
    var arr= arrayOf(1,2,3,4,5,6,7,8)

    println("array size is ${arr.size}" )

    var arr1= arrayOf(1,33,"chs")
    println("Array contains chs : ${arr1.contains("chs")}")

    println("first array : ${arr1.first()}")
    println("last Array : ${arr1.last()}")

    println("Index of 22 : ${arr1.indexOf(22)}")
}