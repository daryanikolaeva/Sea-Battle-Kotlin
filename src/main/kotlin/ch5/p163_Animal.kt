package ch5

open class Animal
{
    open val image = ""
    open val food = ""
    open val habitat =""
    var hunger = 10

    open fun makeNoise()
    {
        println("The Animal ia making noise")
    }

    open fun eat()
    {
        println("The Animal is eating")
    }

    open fun roam()
    {
        println("The Animal is roaming")
    }

    fun sleep()
    {
        println("The Animal is sleeping")
    }

}

open class Feline: Animal()
{
    override fun makeNoise() {
        println("The Feline is roaming")
    }
}

class Lion:Feline()
{
    override val image = "lion.jpg"
    override val food = "meat"
    override val habitat = "savanna"

    override fun makeNoise() {
        println("Roooar")
    }

    override fun eat() {
        println("The Lion is eating $food")
    }
}


open class Canine : Animal()
{
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf : Canine()
{
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooow!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}

class Vet {
    fun giveShot (animal:Animal)
    {
        //Code to do smth medical
        animal.makeNoise()
    }
}

class Hippo : Animal()
{
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise()
    {
        println("Grunt! Grunt!")
    }

    override fun eat()
    {
        println("The Hippo is eating $food")
    }


}

fun main() {
    val animals = arrayOf(Hippo(),Wolf())

    for (item in animals)
    {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()

    vet.giveShot(wolf)
    vet.giveShot(hippo)
}



