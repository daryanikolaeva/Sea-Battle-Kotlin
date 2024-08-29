package ch8

class Wolf2
{
    var hunger = 10
    val food = "meat"

    fun eat()
    {
        println("The Wolf is eating $food")
    }
}

class MyWolf3
{
    var wolf: Wolf2? = Wolf2()

    fun myFunction()
    {
        wolf?.eat()
    }

}

fun getAlphaWolf2():Wolf2?
{
    return Wolf2()
}

fun main() {
    var w: Wolf2? = Wolf2()

    if (w!= null)
    {
        w.eat()
    }

    var x = w?.hunger
    println("The value of x is $x")

    var y = w?.hunger ?: -1
    println("The value of y is $y")

    var myWolf: MyWolf3? = MyWolf3()
    myWolf?.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("Hi","Hello",null)
    for (item in myArray)
    {
        item?.let{ println(it)}
    }

    getAlphaWolf()?.let { it.eat()}

    w = null
    //var z = w!!.hunger выводит исключение

}
