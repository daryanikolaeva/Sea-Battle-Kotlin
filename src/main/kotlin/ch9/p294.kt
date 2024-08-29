package ch9

fun main() {
    val friendSet = setOf("Jim","Sue","Nick")

    val isFredGoing = friendSet.contains("Fred")

    for (item in friendSet) println(item)

}