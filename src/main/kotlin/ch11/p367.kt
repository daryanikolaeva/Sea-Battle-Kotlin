package ch11

fun main() {
    var lambda1: (Double) -> Int

    var lambda2: (Int) -> Double = {it + 7.1}

    var lambda3: (Int) -> Int = {(it * 3) -4}
    lambda3 ={x: Int -> x+56}

    var lambda4: (Double) -> Unit
    lambda4 = {it + 7.1}
    lambda4 ={(it * 3) - 4}
    lambda4 = { println("Hello!")}
    lambda4 = {x:Double -> x+75}

    var lambda5 = {x:Int ->x+56}

}