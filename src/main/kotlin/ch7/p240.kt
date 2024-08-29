package ch7

fun findRecipes(title:String ="",
                ingredient: String ="",
                isVegetarian: Boolean = false,
                difficulty: String ="") : Array<Recipe3>
{
    return arrayOf(Recipe3("Rice","Rice"))
    //код поиска рецептов
}

fun main() {
    val recipes = findRecipes("Thai Curry","", false,"")
    val recipes2 = findRecipes("Thai Curry")
    val recipes3 = findRecipes(title = "Thai Curry")
}
