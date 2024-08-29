package ch2

fun main() {
    val fruit = arrayOf("Apple","Banana","Cherry","Blueberry","Pomegranate")
    var x = 0
    var y:Int
    val index = arrayOf(1,3,4,2)//массив индексов в каком порядке выводить

    while(x<4)
    {
        y=index[x] //присваиваем y нужный нам индекс
        println("Fruit = ${fruit[y]}")
        x= x+1
    }


}