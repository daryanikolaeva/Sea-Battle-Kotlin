package ch9

fun main() {
    val shopping = listOf("Tea", "Eggs", "Milk")

    if (shopping.size > 0)
    {
        println(shopping.get(0)) //обращение к элементу коллекции
    }

    for (item in shopping)
        println(item)

    if(shopping.contains("Milk"))
    {
        println(shopping.indexOf("Milk"))
    }
}