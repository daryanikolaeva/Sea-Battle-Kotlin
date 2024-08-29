package ch11

fun main() {
    var addFive = {x:Int -> x+5}
    addFive = {y: Int -> 5+y}

    val addInts = {x:Int, y: Int -> x+y}
    val result = addInts.invoke(6,7)
    val result2 = addInts(5,4)

}