package ch11

fun main() {
    val lam1 = {c: Double -> println(c)
        c*1.8 + 32}
    lam1(4.0)
}