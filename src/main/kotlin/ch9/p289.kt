package ch9

fun main() {
    val mShopping = mutableListOf("Tea", "Eggs")

    mShopping.sort()
    mShopping.reverse()

    mShopping.shuffle()

    val toAdd = listOf("Cookies", "Sugar")
    mShopping.addAll(toAdd)

    val toRemove = listOf("Milk", "Sugar")
    mShopping.removeAll(toRemove)

    val toRetain = listOf("Milk", "Sugar")

    for (item in mShopping)
        println(item)

    val shoppingCopy = mShopping.toList()

    mShopping.clear()
}