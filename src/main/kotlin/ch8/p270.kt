package ch8

fun myFunction5(str : String)
{
    try{
        val x = str.toInt()
        println(x)
    }
    catch(e: NumberFormatException){
        println("Bummer")
    }

    println("muFunction has ended")
}

fun main() {
    myFunction5("gikjl")
}