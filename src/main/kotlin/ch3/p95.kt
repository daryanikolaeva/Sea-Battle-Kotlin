package ch3

fun main() {
    printSum(5,6)

    val x = 7
    val y:Int = 8
    printSum2(x,y)
}

fun printSum(int1 : Int, int2: Int)
{
    val result = int1 + int2
    println(result)
}

fun printSum2(int1:Int, int2:Int)
{
    val result = int1+int2
    println(result)
}