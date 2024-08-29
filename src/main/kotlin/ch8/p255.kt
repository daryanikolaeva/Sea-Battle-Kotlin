package ch8

import ch5.Wolf

fun main() {
    var w: Wolf? = Wolf()
    w?.eat()
    println(w?.hunger)
    w = null
    println(w?.hunger)
}