package ch4

class TapeDeck
{
    var hasRecorder = false

    fun playTape()
    {
        println("Tape playing")
    }

    fun recordTape()
    {
        if (hasRecorder){
            println("Tape recording")
        }
    }

}

fun main() {
    val t = TapeDeck() //сначала надо создать экземпляр класса
    t.hasRecorder = true
    t.playTape()
    t.recordTape()
}