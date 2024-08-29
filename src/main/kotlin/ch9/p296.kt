package ch9


import ch7.Recipe1

fun main() {
    val a = "Sue"
    val b = a
    val set = setOf(a,b)
    println(set)

    val x = Recipe1("Thai Curry", false)
    val y = Recipe1("Thai Curry", false)
    val set2 = setOf(x,y)
    println(set2)

}