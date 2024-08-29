package ch11

import ch4.Duck

//псевдоним типа
typealias DoubleConversion = (Double) -> Double
typealias DuckArray = Array<Duck>

fun convert1(x:Double, converter: DoubleConversion) : Double
{
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun combine1 (lambda1: DoubleConversion,
              lambda2: DoubleConversion) : DoubleConversion
{
    return {x: Double -> lambda2(lambda1(x))}
}

fun main() {

}

