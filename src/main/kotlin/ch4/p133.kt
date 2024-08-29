package ch4

class DrumKit(var hasTopHat: Boolean, var hasShare : Boolean)
{

 fun playTopHat()
 {
     if(hasTopHat) println("ding ding ba-da-bing!")
 }

    fun playShare()
    {
    if (hasShare) println("bang bang bang!")
    }
}

fun main() {
    val d = DrumKit(true,true)

    d.playTopHat()
    d.playShare()
    d.hasShare=false //меняем hasShare на false, чтобы не выводился
    d.playTopHat()
    d.playShare()
}