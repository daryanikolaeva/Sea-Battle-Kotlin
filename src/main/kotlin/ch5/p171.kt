package ch5

open class Canine2 : Animal()
{
    override fun roam ()
    {
        println("The Canine is roaming")
    }
}

class Wolf2 : Canine2()
{
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooow!")
    }

    override fun eat()
    {
        println("The Wolf is eating $food")
    }

}

fun main() {
    val w = Wolf2()
    w.makeNoise()
    w.roam()
    w.sleep()

    val animal: Animal = Wolf()
    animal.eat()

    val animals = arrayOf(Hippo(),Wolf2())

    for (item in animals)
    {
        item.roam()
        item.eat()
    }
}

