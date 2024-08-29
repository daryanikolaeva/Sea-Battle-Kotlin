package SeaBattle

fun hello() {
    val numbers = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    println("Добро пожаловать в игру")
}

fun displayField(field: Array<Array<String>>) {

    println("Ваше поле")
    println("  0  1  2  3  4  5  6  7  8  9")
    for (i in 0..9) {
        print("$i ")
        for (j in 0..9) {
            print("${field[i][j]}  ")
        }
        println()
    }

}

fun startGame(field: Array<Array<String>>) {
    for (i in 0..9) {
        for (j in 0..9) {
            if (field[i][j] == "x")
                field[i][j] = "."

        }

    }
}


fun userOneBoatCreation(points: MutableList<Point> = mutableListOf(), field: Array<Array<String>>) {

    println("Вам доступны 4 однопалубных, 3 двухпалубных, 2 трехпалубных и 1 четырехпалубный корабли")
    println("Введите поочередно коодинаты однопалубных кораблей в формате x,y")
    var f: Boolean = false
    for (i in 0..3) {
        println("Корабль ${i + 1}")
        while (!f) {
            try {
                val strPoints = readln()
                val intPoints = strPoints.split(',')
                val p: Point = Point(intPoints[0].toInt(), intPoints[1].toInt())
                checkLocation(p, field)
                points.add(p)
                f = true
            } catch (e: IncorrectLocation) {
                println(e.message)
            } catch (e: Exception) {
                println("Введите данные в корректном виде")
            }

        }
        f = false

    }

}

fun userTwoBoatCreation(points: MutableList<Point> = mutableListOf(), field: Array<Array<String>>) {

    println("Введите первую координату двухпалубного корабля в формате x1,y1")
    var f: Boolean = false

    for (i in 0..2) {
        println("Корабль ${i + 1}")
        while (!f) {
            try {
                val strPoints = readln()
                val intPoints = strPoints.split(',')
                var p1: Point = Point(intPoints[0].toInt(), intPoints[1].toInt())
                checkLocation(p1, field)
                points.add(p1)
                secondCreation = true


                var p2: Point = Point()
                if (p1.x == 0) {
                    if (p1.y == 0)
                        println("Выберите направление корабля: 2)вправо, 4)вниз")
                    else if (p1.y == 9)
                        println("Выберите направление корабля: 3)влево, 4)вниз")
                    else
                        println("Выберите направление корабля: 2)вправо, 3)влево, 4)вниз")
                } else if (p1.x == 9) {
                    if (p1.y == 0)
                        println("Выберите направление корабля: 1) вверх, 2)вправо")
                    else if (p1.y == 9)
                        println("Выберите направление корабля: 1) вверх, 3)влево")
                    else
                        println("Выберите направление корабля: 1) вверх, 2)вправо, 3)влево")
                } else {
                    if (p1.y == 0)
                        println("Выберите направление корабля: 1) вверх, 2)вправо, 4)вниз")
                    else if(p1.y == 9)
                        println("Выберите направление корабля: 1) вверх, 3)влево, 4)вниз")
                    else
                    println("Выберите направление корабля: 1) вверх, 2)вправо, 3)влево, 4)вниз")
                }
                val direction = readln().toInt()
                when (direction) {
                    1 -> {

                        p2 = Point(p1.x - 1, p1.y)
                    }

                    2 -> {

                        p2 = Point(p1.x, p1.y + 1)
                    }

                    3 -> {

                        p2 = Point(p1.x, p1.y - 1)
                    }

                    4 -> {

                        p2 = Point(p1.x + 1, p1.y)
                    }

                }
                checkLocation(p2, field)

                points.add(p2)

                f = true

            } catch (e: IncorrectLocation) {
                println(e.message)
            } catch (e: Exception) {
                println("Введите данные в корректном виде")
            }
        }
        f = false
        secondCreation = false
    }

}

fun userThreeBoatCreation(points: MutableList<Point> = mutableListOf(), field: Array<Array<String>>) {
    println("Введите первую координату трехпалубного корабля в формате x1,y1")
    var f: Boolean = false

    for (i in 0..1) {
        println("Корабль ${i + 1}")
        while (!f) {
            try {
                val strPoints = readln()
                val intPoints = strPoints.split(',')
                var p1: Point = Point(intPoints[0].toInt(), intPoints[1].toInt())
                checkLocation(p1, field)
                points.add(p1)
                secondCreation = true


                var p2: Point = Point()
                var p3:Point = Point()
                if (p1.x == 0 || p1.x ==1) {
                    if (p1.y == 0 || p1.y == 1)
                        println("Выберите направление корабля: 2)вправо, 4)вниз")
                    else if (p1.y == 9 || p1.y == 8)
                        println("Выберите направление корабля: 3)влево, 4)вниз")
                    else
                        println("Выберите направление корабля: 2)вправо, 3)влево, 4)вниз")
                } else if (p1.x == 9 || p1.x == 8) {
                    if (p1.y == 0 || p1.y == 1)
                        println("Выберите направление корабля: 1) вверх, 2)вправо")
                    else if (p1.y == 9 || p1.y == 8)
                        println("Выберите направление корабля: 1) вверх, 3)влево")
                    else
                        println("Выберите направление корабля: 1) вверх, 2)вправо, 3)влево")
                } else {
                    if (p1.y == 0 || p1.y == 1)
                        println("Выберите направление корабля: 1) вверх, 2)вправо, 4)вниз")
                    else if(p1.y == 9 || p1.y == 8)
                        println("Выберите направление корабля: 1) вверх, 3)влево, 4)вниз")
                    else
                        println("Выберите направление корабля: 1) вверх, 2)вправо, 3)влево, 4)вниз")
                }
                val direction = readln().toInt()
                when (direction) {
                    1 -> {
                        p2 = Point(p1.x - 1, p1.y)
                        p3 = Point(p1.x - 2, p1.y)
                    }


                    2 -> {
                        p2 = Point(p1.x, p1.y + 1)
                        p3 = Point(p1.x, p1.y + 2)
                    }

                    3 -> {
                        p2 = Point(p1.x, p1.y - 1)
                        p3 = Point(p1.x, p1.y - 2)

                    }

                    4 -> {
                        p2 = Point(p1.x + 1, p1.y)
                        p3 = Point(p1.x + 2, p1.y)
                    }
                }
                checkLocation(p2, field)
                checkLocation(p3, field)

                points.add(p2)
                points.add(p3)

                f = true

            } catch (e: IncorrectLocation) {
                println(e.message)
            } catch (e: Exception) {
                println("Введите данные в корректном виде")
            }
        }
        f = false
        secondCreation = false
    }
}


fun userFourBoatCreation(points: MutableList<Point> = mutableListOf(), field: Array<Array<String>>) {
    println("Введите первую координату четырехпалубного корабля в формате x1,y1")
    var f: Boolean = false
        println("Корабль 1")
        while (!f) {
            try {
                val strPoints = readln()
                val intPoints = strPoints.split(',')
                var p1: Point = Point(intPoints[0].toInt(), intPoints[1].toInt())
                checkLocation(p1, field)
                points.add(p1)
                secondCreation = true

                var p2: Point = Point()
                var p3:Point = Point()
                var p4: Point = Point()
                if (p1.x == 0 || p1.x == 1 || p1.y == 2) {
                    if (p1.y == 0 || p1.y == 1 || p1.y == 2)
                        println("Выберите направление корабля: 2)вправо, 4)вниз")
                    else if (p1.y == 9 || p1.y == 8 || p1.y == 7)
                        println("Выберите направление корабля: 3)влево, 4)вниз")
                    else
                        println("Выберите направление корабля: 2)вправо, 3)влево, 4)вниз")
                } else if (p1.x == 9 || p1.x == 8 || p1.x == 7) {
                    if (p1.y == 0 || p1.y == 1 || p1.y == 2)
                        println("Выберите направление корабля: 1) вверх, 2)вправо")
                    else if (p1.y == 9 || p1.y == 8 || p1.y == 7)
                        println("Выберите направление корабля: 1) вверх, 3)влево")
                    else
                        println("Выберите направление корабля: 1) вверх, 2)вправо, 3)влево")
                } else {
                    if (p1.y == 0 || p1.y == 1 || p1.y == 2)
                        println("Выберите направление корабля: 1) вверх, 2)вправо, 4)вниз")
                    else if(p1.y == 9 || p1.y == 8 || p1.y == 7)
                        println("Выберите направление корабля: 1) вверх, 3)влево, 4)вниз")
                    else
                        println("Выберите направление корабля: 1) вверх, 2)вправо, 3)влево, 4)вниз")
                }
                val direction = readln().toInt()
                when (direction) {
                    1 -> {
                        p2 = Point(p1.x - 1, p1.y)
                        p3 = Point(p1.x - 2, p1.y)
                        p4 = Point(p1.x - 3, p1.y)
                    }


                    2 -> {
                        p2 = Point(p1.x, p1.y + 1)
                        p3 = Point(p1.x, p1.y + 2)
                        p4 = Point(p1.x, p1.y + 3)
                    }

                    3 -> {
                        p2 = Point(p1.x, p1.y - 1)
                        p3 = Point(p1.x, p1.y - 2)
                        p4 = Point(p1.x, p1.y - 3)

                    }

                    4 -> {
                        p2 = Point(p1.x + 1, p1.y)
                        p3 = Point(p1.x + 2, p1.y)
                        p4 = Point(p1.x + 3, p1.y)
                    }
                }
                checkLocation(p2, field)
                checkLocation(p3, field)
                checkLocation(p4, field)

                points.add(p2)
                points.add(p3)
                points.add(p4)

                f = true

            } catch (e: IncorrectLocation) {
                println(e.message)
            } catch (e: Exception) {
                println("Введите данные в корректном виде")
            }
        }
        f = false
        secondCreation = false
    }

