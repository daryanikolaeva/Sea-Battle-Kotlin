package ch2

fun main() {
    var x = 42
    var value = "Value of x is $x"

    var myArray = arrayOf(1,2,3)
    var arraySize = "myArray has ${myArray.size} items"
    var firstItem = "The first item is ${myArray[0]}"

    var result = "myArray is ${if (myArray.size > 10) "large" else "small"}"

    println(result)

   var rnd = kotlin.random.Random.nextInt() //генерация случайного Int числа
    println(rnd)
}