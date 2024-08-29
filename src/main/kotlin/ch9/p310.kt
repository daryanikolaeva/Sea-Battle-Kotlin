package ch9

import ch7.Recipe1

fun main() {
    val r1 = Recipe1("Chicken Soup", false)
    val r2 = Recipe1("Quinoa Salad", true)

    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2)

    val recipeMapCopy = mRecipeMap.toMap()

    val RecipeList = mRecipeMap.toList()
    println(RecipeList)

    val recipeEntries = mRecipeMap.entries

    if (mRecipeMap.size > mRecipeMap.values.toSet().size)
    {
        println("mRecipeMap contains duplicates values")
    }
}