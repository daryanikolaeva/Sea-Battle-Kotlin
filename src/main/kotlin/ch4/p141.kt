package ch4

class Dog5(val name:String, var weight:Int, breed_param:String)
{
    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    val weightInKgs: Double
        get() = weight/2.2

}

fun main() {
val dog = Dog5("Kiki",15,"Dog")
    println(dog.weightInKgs)
}