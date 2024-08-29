package ch9

class Duck1(val size: Int = 17)
{
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other is Duck1 && size == other.size) return true
        return false
    }

    override fun hashCode(): Int {
    return size
    }
}



fun main() {
    val set = setOf(Duck1(),Duck1(17))
    println(set)
}