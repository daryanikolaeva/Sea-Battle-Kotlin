package ch2

fun main() {
    var wordArray1 = arrayOf("24/7", "multi-tier","B-to-B", "dynamic","pervasive")
    //multi-tier - многоуровневый, B-to-B для юридических лиц, pervasive - распространенный
    var wordArray2 = arrayOf("empowered", "leveraged","aligned","targeted")
    //empowered - уполномоченный, leveraged - привлеченный заемный капитал, aligned - выровненный, targeted - нацеленный
    var wordArray3= arrayOf("process","paradigm","solution","portal","vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    val rand = Math.random() //генерирует случайное число от 0 до (почти) 1 и его умножаем на количетсов элементов массива для получения индекса

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)


}