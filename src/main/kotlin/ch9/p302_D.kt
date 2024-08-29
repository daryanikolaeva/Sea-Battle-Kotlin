package ch9

//неправильно переопределены функции
class Duck4 (val size: Int = 17)
{
    override fun equals(other: Any?): Boolean {
        return true
    }

    override fun hashCode(): Int {
        return (Math.random() * 100).toInt()
    }
}

fun main() {
    val set = setOf(Duck4(),Duck4(17))
    println(set)
}