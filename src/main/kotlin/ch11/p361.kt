package ch11

fun main() {
    val msg = {x:Int -> "The value is $x"}

    val add: (Int, Int) -> Int
    add = {x:Int, y:Int -> x+y}

    val greeting: () -> String
    greeting = {"Hello"}

    val greeting2: () -> String = {"Hello"}

}