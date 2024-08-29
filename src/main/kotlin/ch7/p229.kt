package ch7

//деструктуризация - разбиение на компоненты
fun main() {
    val r = Recipe("Chicken Bhuna", false)
    val title = r.component1()
    val title2=r.title
    println(title+" " + title2)

    val (title3,vegetarian) = r
    println(title3+" "+vegetarian)
}