package ch7

data class Recipe4(val title:String,
    val mainIngredient: String,
    val isVegetarian : Boolean = false,
    val difficulty: String = "Easy")
{

}

class Mushroom2(val size: Int, val isMagic: Boolean)
{
    constructor(isMagic_param: Boolean) : this(0, isMagic_param)
    {
        //код при вызове конструктора
    }
}

fun findRecipes2(title:String = "",
                ingredient: String = "",
                isVegetarian: Boolean = false,
                difficulty: String = "") : Array<Recipe4>
{
    //код поиска рецептов
    return arrayOf(Recipe4(title,ingredient,isVegetarian,difficulty))
}

fun addNumbers2(a:Int, b:Int) : Int{
    return a+b
}

fun addNumbers2(a:Double, b:Double) : Double
{
    return a+b
}

fun main() {
    val r1 = Recipe4("Thai Curry", "Chicken" )
    val r2 = Recipe4(title = "Thai Curry", mainIngredient = "Chicken")
    val r3 = r1.copy(title = "Chicken Bhuna")
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 toString: ${r1.toString()}")
    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")

    val (title, mainIngredient, vegetarian, difficulty) = r1
    println("title is $title and difficulty is $difficulty")

    val m1 = Mushroom2(6,false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
    val m2 = Mushroom2(true)

    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")

    println(addNumbers(2,5))
    println(addNumbers(1.6,7.3))
}