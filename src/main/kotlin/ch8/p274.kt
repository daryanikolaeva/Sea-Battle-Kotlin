package ch8

fun setWorkRatePercentage (x: Int)
{
    if (x !in 0..100)
    {
        throw IllegalArgumentException("Percentage not in range 0..100: $x")
    }

}

fun main() {
    try {
        setWorkRatePercentage(110)

    } catch (e: IllegalArgumentException) {
        println("Возникло исключение")
    }
}