package ch9

import ch7.Recipe1

fun main() {
    val r1 = Recipe1("Chicken Soup", false)
    val r2 = Recipe1("Quinoa Salad", true)

    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2)

    val r3 = Recipe1("Thai Curry", false)
    mRecipeMap.put ("Recipe3",r3)

    val r4 = Recipe1("Jambalaya", false)
    var r5 = Recipe1("Sausige Rolls", false)
    val recipeToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipeToAdd)
    println(mRecipeMap)

    mRecipeMap.remove("Recipe2")
    var recipeToRemove = r2
    mRecipeMap.remove("Recipe2", recipeToRemove)

    mRecipeMap.clear()

}