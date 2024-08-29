package ch8

import ch5.Wolf
import ch6.Roamable
import ch6.Wolf6

class MyRoamable
{
    var r: Roamable = Wolf6()

    fun myFunction5()
    {
        if (r is Wolf6)
        {
            //если приведение неудачно возвращается null
            val wolf = r as? Wolf6
            wolf?.eat()
        }
    }
}

fun main() {
    var r: Roamable = Wolf6()
    if (r is Wolf6)
    {
        r.eat()
    }

}