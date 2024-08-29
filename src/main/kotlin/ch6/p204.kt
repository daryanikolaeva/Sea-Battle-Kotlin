package ch6

interface A
{
    fun myFunction ()
    {
        println("from A")
    }
}

interface B
{
    fun myFunction()
    {
        println("from B")
    }

}

class X : A,B
{
    override fun myFunction() {
        super<A>.myFunction()
        super<B>.myFunction() //указываем метод из какого интерфейса использовать
    }
}