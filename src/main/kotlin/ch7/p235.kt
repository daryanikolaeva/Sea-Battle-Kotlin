package ch7

data class Recipe2(val title:String, val isVegetarian: Boolean)
{
    var mainIngredient = ""
}

fun main() {
    val r1 = Recipe2 ("Thai Curry", false)
    r1.mainIngredient = "Chicken"
    val r2 = Recipe2 ("Thai Curry", false)
r2.mainIngredient="Duck"
    println(r1==r2)
}