package ch8

class AnimalException : Exception()
{

}

fun main() {
    try{
        //выполнить рискованную операцию
    }
    catch(e:Exception)
    {
        e.printStackTrace()
        //код, который выполняется при возникновении исключения
    }
}