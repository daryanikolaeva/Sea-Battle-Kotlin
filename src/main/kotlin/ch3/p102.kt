package ch3

fun main() {
    var x= 6
}

fun myFunction()
{
    val x = 10
    var y = x+3
}

fun myFunction2 () : String
{
    val message: String = "Hello"
    return message
}

fun myFunction3(message : String)
{
    var newMessage = "Hi"
    newMessage = message
}

//Переменные параметров рассматриваются как
//локальные переменные, созданные с ключевым
//словом val, поэтому они не могут повторно
//использоваться для других значений
