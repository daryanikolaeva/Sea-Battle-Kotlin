package ch5

class Vet2
{
    fun giveShot (animal:Animal)
    {
        //код медицинской процедуры, которая не понравится животному
        animal.makeNoise()
    }
}

fun main() {
    val vet = Vet2()
    val wolf = Wolf()
    val hippo = Hippo()

    vet.giveShot(wolf)
    vet.giveShot(hippo)
}