package ch11

fun main() {
    val calculation: (Int, Int) -> Int
    //так нельзя
    //calculation = {x: Double, y: Double -> x+y}

    val myLambda: () -> Unit = { println("Hello")}

    //если не обращаешься к возвращаемому значению
    val calculation2: (Int, Int) -> Unit = {x,y -> x+y}

}