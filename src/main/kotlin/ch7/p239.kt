package ch7

class Mushroom (val size: Int, val isMagic: Boolean)
{

    constructor(isMagic_param: Boolean) : this (0, isMagic_param)
    {
        //код при вызове вторичного конструктора
    }
}

fun main() {
    val m = Mushroom(true)
}