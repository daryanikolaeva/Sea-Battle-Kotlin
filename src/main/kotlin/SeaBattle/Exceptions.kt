package SeaBattle

import java.lang.Exception

public var checking = {str: String -> if (str == "."||str == "x") "x" else "B"}


class IncorrectLocation(message:String):Exception(message)
{

}

class DoubleFight(message: String) : Exception(message)
{

}

fun checkDoubleFight(fightPoint:Point, field:Array<Array<String>>){
    if (field[fightPoint.x][fightPoint.y]!=".")
        throw DoubleFight("В эту точку уже били")
}



fun checkLocation(newP: Point, field:Array<Array<String>>)
{
    if (!secondCreation) {
        if (field[newP.x][newP.y] == "x" || field[newP.x][newP.y] == "B")
            throw IncorrectLocation("Корабли должны расополагаться на расстоянии минимум 1 клетки")
    }


    for(i in 0..9)
    {
        for (j in 0..9)
        {

                if (newP.x == i && newP.y == j)
                {
                    field[i][j] = "B"
                    when (i)
                    {
                        0 -> {
                            if (j==0) {
                                field[i + 1][j] = checking(field[i + 1][j])
                                field[i][j + 1] = checking(field[i][j + 1])
                            }
                            if (j == 9)
                            {
                                field[i][j-1] = checking(field[i][j-1])
                                field[i+1][j]= checking(field[i+1][j])
                            }
                            if (j!=0 && j!=9) {
                                field[i + 1][j] = checking(field[i + 1][j])
                                field[i][j + 1]= checking(field[i][j + 1])
                                field[i][j - 1] = checking(field[i][j - 1])
                            }
                        }

                        9->{
                            if (j ==0){
                                field[i - 1][j] =checking( field[i - 1][j])
                                field[i][j + 1] =  checking(field[i][j + 1])
                            }
                            if (j==9) {
                                field[i][j - 1] = checking(field[i][j - 1])
                                field[i - 1][j]= checking(field[i - 1][j])
                            }
                            if (j!=0 && j!= 9) {
                                field[i - 1][j]=   checking(field[i - 1][j])
                                field[i][j+1] =   checking(field[i][j+1])
                                field[i][j-1] =     checking(field[i][j-1])
                            }

                        }
                        else ->{
                            when (j)
                            {
                                0 ->
                                {
                                    field[i+1][j] = checking(field[i+1][j])
                                    field[i-1][j] =     checking(field[i-1][j])
                                    field[i][j+1] =     checking(field[i][j+1])
                                }
                                9->
                                {
                                    field[i+1][j] =  checking(field[i+1][j])
                                    field[i-1][j]=     checking(field[i-1][j])
                                    field[i][j-1]=   checking(field[i][j-1])
                                }

                                else -> {
                                    field[i+1][j]=  checking(field[i+1][j])
                                    field[i-1][j]=   checking(field[i-1][j])
                                    field[i][j+1]=    checking(field[i][j+1])
                                    field[i][j-1]=       checking(field[i][j-1])

                                }
                            }
                        }

                        }
                    }

                }
            }





    println("Ваше поле")
    println("  0  1  2  3  4  5  6  7  8  9")
    for(i in 0 .. 9)
    {
        print ("$i ")
        for (j in 0..9)
        {
            print("${field[i][j]}  ")
        }
        println()
    }
}


