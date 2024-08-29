package ch7

//в дата классе == проверяется на основании
//значений свойств каждого объекта

data class Recipe (val title: String, val isVegeterian: Boolean)
{

}

fun main() {
    var r1 = Recipe("Chicken Bhuna", false)
    var r2 = Recipe("Chicken Bhuna", false)
    println(r1==r2)

    //для равных объектов возвращается одинаковый хэш-код
    println("${r1.hashCode()} - ${r2.hashCode()}")

    //toString возвращает строку со всеми занчениями свойств
    println(r1.toString())

}