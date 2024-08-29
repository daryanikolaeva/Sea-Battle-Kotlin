package ch4



class Dog3 (val name:String, var weight : Int, breed_param : String)
{
    init{
    println("Dog $name has been created.")
}

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    //var temperament : String //так нельзя
    var temperament = ""

    //или
    lateinit var temp : String //так можно только со  String

    init{
        println("The breed is $breed.")
    }

}

fun main() {
    val d1 = Dog3("Holy", 13, "Chichi")
}