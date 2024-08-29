package ch8

import ch5.Wolf

fun main() {
    var w: Wolf? = Wolf()

    var x = w?.hunger // тип Int?
    w?.hunger = 6 // если w = null код ничего не делает

    var myWolf : MyWolf? = MyWolf()
    myWolf?.w?.hunger=2
    println(myWolf?.w?.hunger)
}