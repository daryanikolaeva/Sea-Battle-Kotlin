package ch8

//код выполняется
class Cat (var name : String? = "")
{
    fun Meow()
    {
        println("Meow!")
    }

}

fun main() {
    var myCats = arrayOf(Cat("Misty"), null, Cat("Socks"))

    for (cat in myCats)
    {
        if (cat!=null)
        {
            print("${cat.name}: ")
            cat.Meow()
        }
    }
}