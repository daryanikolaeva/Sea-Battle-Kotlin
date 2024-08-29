package ch8

import ch5.Wolf

class myWolf1
{
    var w: Wolf? = Wolf()

    //так нельзя
    fun myFunction()
    {
//        if (w != null) {
//            w.eat()
//        }
    }
}
fun main() {
    var w: Wolf? = Wolf()

    if (w!=null)
    {
        w.eat()
    }

    if (w!=null && w.hunger < 5)
    {
        w.eat()
    }


}
