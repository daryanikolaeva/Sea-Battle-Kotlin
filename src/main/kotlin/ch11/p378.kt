package ch11

fun combine (lambda1: (Double) -> Double,
             lambda2: (Double) -> Double) : (Double) -> Double
{
    return {x:Double -> lambda2(lambda1(x))}
}

fun main() {
    val kgsToPounds = {x: Double -> x*2.204623}
    val poundsToUSTons = {x: Double -> x / 2000.0}

    val kgsToUSTons = combine(kgsToPounds,poundsToUSTons)

    val usTons = kgsToUSTons(1000.0)
    println(usTons)
}