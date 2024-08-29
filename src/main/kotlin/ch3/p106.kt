package ch3

fun main() {
    var x = 1
    while(x<11)
        x=x+1
    var y=0
    for(i in 1..10)
    {
        y++
    }
    println(x)
    println(y)
    for(i in 1 until 100) println(i) //не включительно последний символ

    for (i in 15 downTo 1) println(i) //в обратном порядке

    for (i in 1..100 step 2) println(i) //шаг 2

    val options = arrayOf(1,2,3,4)
    for(item in options)
    {
        println("$item is an item in the array")
    }

    for (index in options.indices) //перебор по индексам
    {
        println("Index $index has item ${options[index]}")
    }

    println()
    for ((index,item) in options.withIndex()) //перебор по членам массива с индексами
    {
        println("Index $index has item $item")
    }


}