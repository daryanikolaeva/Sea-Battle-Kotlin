package ch1

fun main() {
    //val x=10
    var x=10
    while(x>1)
    {
        x = x-1 //нельзя изменять переменню с ключевым словом val
        if(x<3) println("small x")
    }
}