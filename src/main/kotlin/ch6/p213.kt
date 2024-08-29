package ch6

fun main() {
    var x = 0

    when (x)
    {
      0 -> println("x is zero")
        1,2 -> println("x is 1 or 2")
        else -> println("x is some other value")
    }
     var y = when (x)
     {
         0 -> true
         else -> false
     }

    var r : Roamable = Wolf6()
    var wolf = r as Wolf6
    wolf.eat()
}