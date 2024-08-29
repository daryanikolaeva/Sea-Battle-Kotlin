package ch4

class DVDPlayer(var hasRecorder:Boolean)
{

    fun playDVD()
    {
        println("DVD playing")
    }

    fun recordDVD()
    {
        if(hasRecorder)
        {
            println("DVD recording")
        }
    }
}

fun main() {
val d = DVDPlayer(true)
    d.playDVD()
    d.recordDVD()
}