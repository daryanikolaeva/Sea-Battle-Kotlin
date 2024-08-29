package ch8

//не компилируется
class Cat4(var name: String = "") {
    fun Meow() {
        println("Meow!")
    }
}

fun main() {
    //имя не может иметь значение null
    //var myCats = arrayOf(Cat4("Misty"), Cat4(null), Cat4("Socks"))

    //for (cat in myCats)
//    {
//        if (cat != null) {
//            print("${cat?.name}: ")
//            cat?.Meow()
//        }
//    }
}