package whileLoop

fun main(args : Array<String>){

    var ch='A'
    when(ch){
        'A' -> println("A is a Vowel");
        'E' -> println("E is a Vowel");
        'I' -> println("I is a Vowel");
        'U' -> println("U is a Vowel");
        'O' -> println("O is a Vowel");

        else -> println("ch is consonant");

    }

//    We can also rewrite the same code in a more cleaner way like this:
    when(ch){
        'A','E','I','U','O' -> println("$ch is Vowel")
        else -> println("$ch is consonent");
    }

}