package ch1

fun main() {
    //команды
    var x = 3
    val name = "Cormoran"
    x = x*10
    print("x is $x.")

    //циклы
    while (x>20) {
        x = x - 1
        print("x is now $x.")
    }
    for (i in 1..10)
    {
        x = x+1
        print ("x is now $x.")
    }

    //условие
    if (x==20) {
        println("x must be 20.")
    }
    else {
        println("x isn't 20")
    }
    if (name.equals("Cormoran"))
    {
        println("$name Strike")
    }
}