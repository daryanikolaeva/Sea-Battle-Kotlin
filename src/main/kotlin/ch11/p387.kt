package ch11

//нельзя присвоить значение Int лямбда выражению по умолчанию
//fun myFun1 (x:Int = 6, y: (Int) -> Int =7) : Int{
//    return y(x)
//}

//функция возвращает Int, хотя не указано возвращаемое значение
//fun myFun2 (x: Int = 6, y: (Int) -> Int = {it})
//{
//    return y(x)
//}

fun myFun3 (x:Int = 6, y : (Int ) -> Int = {x:Int -> x+6}) : Int{
    return (y(x))
}

fun myFun4 (x: Int, y:Int,
            z: (Int, Int) -> Int = {x: Int, y:Int -> x+y} )
{
    z(x,y)
}

fun myFun5 (x: (Int) -> Int = { println(it)
    it + 7})
{
    x(4)
}

fun main() {
    var res3 = myFun3()
    println(res3)
    myFun5()
}

