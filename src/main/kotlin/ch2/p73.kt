package ch2

fun main() {
    // var x: Int = 65.2 недопустимое значение
    var x: Int = 65

    var isPunk= true

    // var message = 'Hello' должно быть в кавычках
    var message = "Hello"

    var y = 7

    var z: Int = y

    y = y+50

    println(z)
    println(y)

    var s: Short

    var bigNum: Long = y.toLong()
    println(bigNum)

    var b:Byte = 2

    var smallNum: Short = b.toShort()

    //b=smallNum нельзя без преобразования типов
    b=smallNum.toByte()

    //isPunk = "false" нужно без кавычек
    isPunk = false

    var k = y.toDouble()

    //b=k.toByte() при преобразовании из типа double часть после запятой вся удалится, это может привести к неккоректным вычислениям

    s=0b10001 //двоичное число


}