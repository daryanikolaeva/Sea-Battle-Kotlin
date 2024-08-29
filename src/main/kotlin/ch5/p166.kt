package ch5

open class Animal2
{
    var image = ""
    open val name = ""
}

class Hippo2:Animal2()
{
    override var name = "Hippo"
    init{
        image = "hippo.jpg"
    }
}
