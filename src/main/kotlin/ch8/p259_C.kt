package ch8

//выводит имя null
class Cat3(var name: String? = null) {
    fun Meow() { println("Meow!") }
}

fun main() {
    var myCats = arrayOf(Cat3("Misty"), null, Cat3("Socks"))

    for (cat in myCats)
    {
        print("${cat?.name}: ") //
        cat?.Meow()
    }

}