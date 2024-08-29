package ch6

interface Roamable
{
    fun roam()
    {
        println("The Roamable is roaming")
    }
}

class Vehicle:Roamable{

    override fun roam() {
        println("The Vehicle is roaming")
    }
}

abstract class Animal6: Roamable //если класс абстарктынй то не надо помечать открытым
{
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()
    abstract fun eat()

    override fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }

}

class Vet6 {
    fun giveShot(animal: Animal6) {
        //Код ветеринарной процедуры
        animal.makeNoise()
    }
}

class Hippo6 : Animal6()
{
    override val image="hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}

abstract  class Canine6 : Animal6() {

    override fun roam() {
        println("The Canine is roaming")
    }

}

class Wolf6 : Canine6() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"
    override fun makeNoise() {
        println("Hooooowl!")
    }
    override fun eat() {
        println("The Wolf is eating $food")
    }


}


fun main() {
val vet = Vet6()
    val wolf = Wolf6()
    val hippo = Hippo6()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo6(), Wolf6(),Vehicle())
    for (item in roamables)
    {
    item.roam()
        if (item is Animal6)
        {
            item.eat()
        }
    }

    val animal: Animal6 = Wolf6()
    if (animal is Wolf6)
    {
        animal.eat()
    }
}