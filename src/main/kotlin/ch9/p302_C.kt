package ch9
//верно
data class Duck3(val size: Int = 18)


fun main() {
    val set = setOf(Duck3(),Duck3(17))
    println(set)
}