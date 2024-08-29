package ch4

class Dog6(val name:String, weight_param: Int, breed_param:String) {
    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }

}


fun main() {
    val d = Dog6("Nana", -10, "Dog")
    println(d.weight)
}