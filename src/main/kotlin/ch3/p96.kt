package ch3

fun main() {
    val x = 7
    val y = 9
    val max = max(x,y)
    println(max)
    printSum3(x,y)
}

fun max(a:Int,b:Int) : Int{
    val maxValue = if (a>b) a else b
    return maxValue
}

fun printSum3(int1 : Int, int2 : Int) : Unit{
    val result = int1+int2
    println(result)
}
