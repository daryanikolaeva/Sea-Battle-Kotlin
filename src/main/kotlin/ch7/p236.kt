package ch7

data class Recipe3(
    val title: String,
    val mainIngredient: String,
    val isVegetarian: Boolean = false,
    val difficulty: String = "Easy"
)
{

}

fun main() {
    val r = Recipe3("Spaghetti Bolognese", "Beef")
    val r2 = Recipe3("Spaghetti Bolognese", "Tofu", true)
    val r3 = Recipe3("Spaghetti Bolognese", "Tofu", true, "Moderate")

    val r4 = Recipe3(
        title = "Spaghetti Bolognese",
        mainIngredient = "Beef"
    )
    val r5 = Recipe3(
        mainIngredient = "Beef",
        title = "Spaghetti Bolognese"
    )
    val r6 = Recipe3(
        mainIngredient = "Beef",
        title = "Spaghetti Bolognese",
        difficulty = "Moderate"
    )

}