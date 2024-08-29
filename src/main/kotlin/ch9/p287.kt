package ch9

fun main() {


    val mShopping = mutableListOf("Tea", "Eggs")
    mShopping.add("Milk")
    mShopping.add(1,"Milk")


    if (mShopping.contains("Milk"))
        mShopping.remove("Milk") //удаляет первый найденный

    if (mShopping.size > 1)
        mShopping.removeAt(1)

    if (mShopping.size > 0)
        mShopping.set(0,"Coffee")

    for (item in mShopping)
        println(item)
}