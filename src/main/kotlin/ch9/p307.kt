package ch9

import ch7.Recipe1

fun main() {

    val r1 = Recipe1("Chicken Soup", false)
    val r2 = Recipe1("Quinoa Salad", true)
    val r3 = Recipe1("Thai Curry", false)

    val recipeMap = mapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println(recipeMap)

    recipeMap.containsKey("Recipe1")

    val recipeToCheck = Recipe1 ("Chicken Soup",false)
    if (recipeMap.containsValue(recipeToCheck))
        {
        //код, выполняемый при наличии значения в Map
        }

    if (recipeMap.containsKey("Recipe1"))
    {
        val recipe = recipeMap.getValue("Recipe1")
        println(recipe)
    }

    for((key, value) in recipeMap)
    {
        println("Key is $key, value is $value")
    }

    var h = recipeMap.get("Recipe1")
    println(h)
}