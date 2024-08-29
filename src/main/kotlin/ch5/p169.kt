package ch5

open class Vehicle{
    open fun lowerTemperature ()
    {
        println("Turn down temperature")
    }
}

open class Car2 : Vehicle ()
{
    final override fun lowerTemperature() {
        println("Turn on air conditioning")
    } //запрещение наследования

}

class ConvertibleCar2 : Car2()
{

}




