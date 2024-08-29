package ch3

fun main() {
    var x = 0
    var y = 20
    for (outer in 1..3)
    {
        for(inner in 4 downTo 2)
        {
            //x+=6 // 81 23

            //x-- //18 23

            //y = x+y // 27 131

            //y = 7 //27 6

            //x = x+y
            //y = x-7 //4286 4275

            //x= y
            //y ++ //35 32

            y++
            x+=3
        }
        y -=2
    }
    println("$x $y")
}