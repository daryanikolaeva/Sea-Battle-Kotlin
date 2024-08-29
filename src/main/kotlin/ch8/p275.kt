package ch8

import ch5.Wolf

fun main() {
    var str: String = "Hello"
    var result = try {str.toInt()} catch (e:Exception){null}
    println(result)

    var w: Wolf? = Wolf()
    val h = w?.hunger ?: throw AnimalException()
}