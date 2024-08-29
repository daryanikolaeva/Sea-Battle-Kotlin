package ch2

fun main() {
    val firemen = arrayOf("Pugh", "Pugh","Barney McGrew", "Cuthbert","Dibble","Grub")
    var firemanNo = 0

    while(firemanNo<6)
    {
        println("Fireman number $firemanNo is ${firemen[firemanNo]}") //нужно сделать фигурные скобки
        firemanNo++
    }

}
