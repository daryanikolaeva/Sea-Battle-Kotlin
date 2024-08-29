package ch9

fun main() {
    var array = arrayOf(1,2,3)
    var nullArray : Array<String?> = arrayOfNulls(2)
    val size = array.size
    array.reverse()
    var isIn = array.contains(1)
    val sum = array.sum()
    val average = array.average()
    array.min()
    array.max()
    array.sort()
    var array2 = array.plus(4)
    for(item in array)
        println(item)

}