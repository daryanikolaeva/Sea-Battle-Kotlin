package ch8

import ch5.Wolf

class MyWolf
{
    var w: Wolf? = Wolf()
}

fun main() {

    var myWolf: MyWolf? = MyWolf()
    //проверяем myWolf на null, а потом w на null
    println(myWolf?.w?.hunger)


}