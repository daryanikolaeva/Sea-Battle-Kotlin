package ch2

fun main() {
    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0

   // while(x<5) нельзя тк индексация массива начинается с 0 и 4 элемента в массиве не будет
    while(x<4)
    {
        println("${hobbits[x]} is a good Hobbit name")
        x++
    }
}