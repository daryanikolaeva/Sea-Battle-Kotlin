package ch9

//неправильно переопределены функции
class Duck2(val size: Int = 17)
{
    override fun equals(other: Any?): Boolean {
        return false
    }

    override fun hashCode(): Int {
        return 7
    }
}

fun main() {
    val set = setOf(Duck2(),Duck2(17))
    println(set)
}