package ch8

import ch5.Wolf

fun main() {
    var w: Wolf? = Wolf()

    var x = if (w != null) w.hunger else -1
    //если значение в левой части не равно null
    //то возвращается оно, если оно равно null
    //то -1
    var y = w?.hunger ?: - 1
}