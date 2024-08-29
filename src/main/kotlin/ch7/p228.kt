package ch7

fun main() {
    var r1 = Recipe("Thai Curry", false)
    var r2 = r1.copy(isVegeterian = true)
}