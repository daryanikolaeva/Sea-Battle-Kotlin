package ch3

fun main() {
    val message = "Hi!"
    var arguments = arrayOf(1,2,3)
    val x = 4
    doSomething(message,x)
    val z = timesThreeNew(x)
    println(z)
    val max =maxValue(arguments)
    println(max)
}

fun doSomething(msg : String, i:Int) : Unit{
    if (i>0)
    {
        var x = 0
        while(x<i)
        {
            println(msg)
            x=x+1
        }
    }
}

fun timesThree(x : Int)
{
    //x = x*3 //х не может изменяться, тк это локальная переменная val
    //return x
}

fun timesThreeNew(x:Int):Int = x*3

fun maxValue(args:Array<Int>) : Int //нужно добавить возвращаемое значение
{
    var max = args[0]
    var x= 1
    while(x<args.size)
    {
        var item = args[x]
        max = if (max>=item) max else item
        x = x+1
    }
    return max
}



