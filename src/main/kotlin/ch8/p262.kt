package ch8

import ch5.Wolf

fun getAlphaWolf() : Wolf?
{
    return Wolf()
}

fun main() {
    var array = arrayOf("Hi", "Hello", null)

    for (item in array)
    {
        item?.let { println(it) }
    }

    var alpha = getAlphaWolf()
    if (alpha != null)
    {
        alpha.eat()
    }

    //можно не создавать отдельную переменную
    // для возвращаемого значения функции
    getAlphaWolf()?.let{
        it.eat()
    }


}