package ch8

fun printInt(x : Int?)
{
    println(x)
}

fun result(): Long?{
    return null
}

fun main() {
    var str: String? = "Pizza"
    var str2: String? = null
    println(str2)

    var x: Int? = null
    printInt(x)
}