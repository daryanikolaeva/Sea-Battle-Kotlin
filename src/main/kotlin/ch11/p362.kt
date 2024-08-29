package ch11

fun main(){
    val addFive: (Int) -> Int = {x:Int -> x+5}

    val addFive2: (Int) -> Int = {x -> x+5}

    val addFive3:(Int) -> Int = {it + 5}
    val z = addFive3(2)
    println(z)
}