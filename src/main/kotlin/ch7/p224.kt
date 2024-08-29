package ch7

class Wolf(var name : String){


}
fun main() {
    val w1 = Wolf("w1")
    val w2 = Wolf("w2")
    println(w1.equals(w2))
    val w3 = w1
    println(w1.equals(w3))

    val w = Wolf("w")
    println(w.hashCode())
    println(w.toString())
}