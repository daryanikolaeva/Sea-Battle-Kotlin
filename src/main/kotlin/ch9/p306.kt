package ch9

import ch7.Recipe1

fun main() {
    val r1 = Recipe1("Chicken Soup", false)
    val r2 = Recipe1("Quinoa Salad", true)
    val r3 = Recipe1("Thai Curry", false)

    val recipeMap = mapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println(recipeMap)

    val recipeMap2: Map<String, Recipe1>

}