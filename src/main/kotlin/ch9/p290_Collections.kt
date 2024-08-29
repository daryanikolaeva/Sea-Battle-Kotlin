package ch9

data class Recipe(var name: String)

fun main() {
    //List
    var mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("mShoppingList original : $mShoppingList")

    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added: $mShoppingList")

    if(mShoppingList.contains("Tea"))
        mShoppingList.set(mShoppingList.indexOf("Tea"),"Coffee")

    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")

    mShoppingList.reverse()
    println("mShoppingList is reversed: $mShoppingList")

    //Set
    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")

    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")

    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")

    //Map
    var r1 = Recipe("Chicken Soup")
    var r2 = Recipe("Quinoa Salad")
    var r3 = Recipe("Thai Curry")
    var r4 = Recipe("Jambalaya")
    var r5 = Recipe("Sausage Rolls")

    val mRecipeMap = mutableMapOf("Recipe1" to r1,"Recipe2" to r2,"Recipe3" to r3)
    println("mRecipeMap original: $mRecipeMap")

    val recipesToAdd = mutableMapOf("Recipe4" to r4,"Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("mRecipeMap updated: $mRecipeMap")

    if (mRecipeMap.containsKey("Recipe1"))
    {
        println("Recipe1 is: ${mRecipeMap.getValue("Recipe1")}")
    }

}