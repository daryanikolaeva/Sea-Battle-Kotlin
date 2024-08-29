package SeaBattle

var index = 0

var user1numberOfHits2 = 1
var user1numberOfHits3 = 1
var user1numberOfHits4 = 1

var user2numberOfHits2 = 1
var user2numberOfHits3 = 1
var user2numberOfHits4 = 1

var user1x2: Int = 10
var user1y2: Int = 10

var user2x2: Int = 10
var user2y2: Int = 10

var user1x3: MutableList<Int> = mutableListOf()
var user1y3: MutableList<Int> = mutableListOf()
var user2x3: MutableList<Int> = mutableListOf()
var user2y3: MutableList<Int> = mutableListOf()

var user1x4: MutableList<Int> = mutableListOf()
var user1y4: MutableList<Int> = mutableListOf()
var user2x4: MutableList<Int> = mutableListOf()
var user2y4: MutableList<Int> = mutableListOf()

fun userChoice(field:Array<Array<String>>, points: MutableList<Point>) {
    var igrok: Int = 0
    val str: String = if (points == user2Points) {
        "Ходит первый игрок"
    } else
        "Ходит второй игрок"

    println(str)
    displayCopy(field)
    var step = true
    var vvod = false
    var hitPoint = Point()
    var oneHit = false
    var twoHit = false
    var threeHit = false
    var fourHit = false






    while (step) {

        while (!vvod) {
            try {
                println("Введите координаты для удара")
                var strPoint = readln()
                var arrPoint = strPoint.split(',')
                hitPoint = Point(arrPoint[0].toInt(), arrPoint[1].toInt())
                checkDoubleFight(hitPoint, field)
                vvod = true
            } catch (e: DoubleFight) {
                println(e.message)
            } catch (e: Exception) {
                println("Введите координаты в корректном виде")
            }
        }
        vvod = false
        if (str == "Ходит первый игрок") {
            igrok = 1
            oneHit = checkSizeOfBoat(hitPoint, oneDeckBoats2)
            twoHit = checkSizeOfBoat(hitPoint, twoDeckBoats2)
            threeHit = checkSizeOfBoat(hitPoint, threeDeckBoats2)
            fourHit = checkSizeOfBoat(hitPoint, fourDeckBoats2)
        } else {
            igrok = 2
            oneHit = checkSizeOfBoat(hitPoint, oneDeckBoats)
            twoHit = checkSizeOfBoat(hitPoint, twoDeckBoats)
            threeHit = checkSizeOfBoat(hitPoint, threeDeckBoats)
            fourHit = checkSizeOfBoat(hitPoint, fourDeckBoats)
        }

        if (!oneHit && !twoHit && !threeHit && !fourHit) {
            println("Мимо!")
            field[hitPoint.x][hitPoint.y] = "*"
            displayCopy(field)
            break
        }

        if (oneHit) {
            points.removeAt(index)
            for (i in 0..9) {
                if (hitPoint.x == i) {
                    for (j in 0..9) {
                        if (hitPoint.y == j) {
                            println("Убил")
                            field[i][j] = "x"
                        }
                    }
                }
            }
        } else if (twoHit) {
            points.removeAt(index)
            for (i in 0..9) {
                if (hitPoint.x == i) {
                    for (j in 0..9) {
                        if (hitPoint.y == j) {
                            if (igrok == 1) {
                                if (user1numberOfHits2 == 1) {
                                    println("Попал")
                                    field[hitPoint.x][hitPoint.y] = "/"
                                    user1x2 = i
                                    user1y2 = j
                                    user1numberOfHits2++
                                } else {
                                    println("Убил")
                                    field[hitPoint.x][hitPoint.y] = "x"
                                    field[user1x2][user1y2] = "x"
                                    user1numberOfHits2 = 1
                                    user1x2 = 10
                                    user1y2 = 10
                                }
                            } else {
                                if (user2numberOfHits2 == 1) {
                                    println("Попал")
                                    field[hitPoint.x][hitPoint.y] = "/"
                                    user2x2 = i
                                    user2y2 = j
                                    user2numberOfHits2++
                                } else {
                                    println("Убил")
                                    field[hitPoint.x][hitPoint.y] = "x"
                                    field[user2x2][user2y2] = "x"
                                    user2numberOfHits2 = 1
                                    user2x2 = 10
                                    user2y2 = 10
                                }
                            }
                        }
                    }

                }
            }
        } else if (threeHit) {
            points.removeAt(index)
            for (i in 0..9) {
                if (hitPoint.x == i) {
                    for (j in 0..9) {
                        if (hitPoint.y == j) {
                            if (igrok == 1) {
                                if (user1numberOfHits3 < 3) {
                                    println("Попал")
                                    field[hitPoint.x][hitPoint.y] = "/"
                                    user1x3.add(i)
                                    user1y3.add(j)
                                    user1numberOfHits3++
                                } else {
                                    println("Убил")
                                    field[hitPoint.x][hitPoint.y] = "x"
                                    for (k in 0..1) {
                                        field[user1x3[k]][user1y3[k]] = "x"
                                    }
                                    user1numberOfHits3 = 1
                                    user1x3.clear()
                                    user1y3.clear()
                                }
                            } else {
                                if (user2numberOfHits3 < 3) {
                                    println("Попал")
                                    field[hitPoint.x][hitPoint.y] = "/"
                                    user2x3.add(i)
                                    user2y3.add(j)
                                    user2numberOfHits3++
                                } else {
                                    println("Убил")
                                    field[hitPoint.x][hitPoint.y] = "x"
                                    for (k in 0..1) {
                                        field[user2x3[k]][user2y3[k]] = "x"
                                    }
                                    user2numberOfHits3 = 1
                                    user2x3.clear()
                                    user2y3.clear()
                                }
                            }
                        }
                    }
                }
            }
        } else if (fourHit) {
            points.removeAt(index)
            for (i in 0..9) {
                if (hitPoint.x == i) {
                    for (j in 0..9) {
                        if (hitPoint.y == j) {
                            if (igrok == 1) {
                                if (user1numberOfHits4 < 4) {
                                    println("Попал")
                                    field[hitPoint.x][hitPoint.y] = "/"
                                    user1x4.add(i)
                                    user1y4.add(j)
                                    user1numberOfHits4++
                                } else {
                                    println("Убил")
                                    field[hitPoint.x][hitPoint.y] = "x"
                                    for (k in 0..2) {
                                        field[user1x4[k]][user1y4[k]] = "x"
                                    }
                                    user1numberOfHits4 = 1
                                    user1x4.clear()
                                    user1y4.clear()
                                }
                            } else {
                                if (user2numberOfHits4 < 4) {
                                    println("Попал")
                                    field[hitPoint.x][hitPoint.y] = "/"
                                    user2x4.add(i)
                                    user2y4.add(j)
                                    user2numberOfHits4++
                                } else {
                                    println("Убил")
                                    field[hitPoint.x][hitPoint.y] = "x"
                                    for (k in 0..2) {
                                        field[user2x4[k]][user2y4[k]] = "x"
                                    }
                                    user2numberOfHits4 = 1
                                    user2x4.clear()
                                    user2y4.clear()
                                }
                            }
                        }
                    }
                }

            }
        }
        displayCopy(field)


    }
        println("Ход следующего игрока. Нажмите Enter чтобы продолжить")
        readln()
        repeat(100) { println() }



}


fun checkSizeOfBoat(p:Point, points: MutableList<Point>) : Boolean{
    for (point in points)
    {
        if (p==point) {
            index = points.indexOf(point)
            return true
        }
    }
    return false
}

fun displayCopy(field: Array<Array<String>>) {

    println("  0  1  2  3  4  5  6  7  8  9")
    for (i in 0..9) {
        print("$i ")
        for (j in 0..9) {
            print("${field[i][j]}  ")
        }
        println()
    }

}

fun makeCopy(onePoints: MutableList<Point>, twoPoints: MutableList<Point>) {
    for(i in 0..3)
    {
        oneDeckBoats.add(onePoints[i])
        oneDeckBoats2.add(twoPoints[i])
    }

    for(i in 4..9)
    {
        twoDeckBoats.add(onePoints[i])
        twoDeckBoats2.add(twoPoints[i])
    }

    for (i in 10..15)
    {
        threeDeckBoats.add(onePoints[i])
        threeDeckBoats2.add(twoPoints[i])
    }

    for(i in 16..19)
    {
        fourDeckBoats.add(onePoints[i])
        fourDeckBoats2.add(twoPoints[i])
    }
}