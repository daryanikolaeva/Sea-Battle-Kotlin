package ch3

fun main() {
    val x=8
    val y = 10
    val res = max1(x,y)
    println(res)
}

fun max1(a: Int, b:Int) = if (a>b) a else b