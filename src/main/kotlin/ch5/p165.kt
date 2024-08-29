package ch5

class Hippo1 : Animal ()
{
    //код Hippo
}

open class Car(val make: String, val model: String) {
    //код класса Car
}

class ConvertibleCar (make_param:String, model_param: String)
    : Car (make_param, model_param)
{
        //код класса ConvertibleCar
    }

fun main() {

}