package ch8

import ch5.Wolf

fun main() {
    var w: Wolf? = Wolf()

    if (w!= null)
    {
        println(w.hunger)

    }

    //действие выполняется только в том случае
    //если w != null
    w?.let{
        println(it.hunger)
    }

}