package SeaBattle

public var secondCreation = false
public var userField:Array<Array<String>> = Array(10) { Array(10) { "." } }
public var userCopy:Array<Array<String>> = Array(10) { Array(10) { "." } }
public var userPoints: MutableList<Point> = mutableListOf()

public var user2Field:Array<Array<String>> = Array(10) { Array(10) { "." } }
public var user2Points: MutableList<Point> = mutableListOf()
public var user2Copy:Array<Array<String>> = Array(10) { Array(10) { "." } }

var oneDeckBoats: MutableList<Point> = mutableListOf()
var twoDeckBoats: MutableList<Point> = mutableListOf()
var threeDeckBoats: MutableList<Point> = mutableListOf()
var fourDeckBoats: MutableList<Point> = mutableListOf()

var oneDeckBoats2: MutableList<Point> = mutableListOf()
var twoDeckBoats2: MutableList<Point> = mutableListOf()
var threeDeckBoats2: MutableList<Point> = mutableListOf()
var fourDeckBoats2: MutableList<Point> = mutableListOf()



fun main() {
    hello()

    println("Игрок 1:")
    userOneBoatCreation(userPoints, userField)
    userTwoBoatCreation(userPoints, userField)
    userThreeBoatCreation(userPoints, userField)
    userFourBoatCreation(userPoints, userField)
    startGame(userField)
    displayField(userField)
    println("Нажмите Enter для перехода к следующему игроку")
    readln()
    repeat(100) { println() }

    println("Игрок 2:")
    userOneBoatCreation(user2Points, user2Field)
    userTwoBoatCreation(user2Points, user2Field)
    userThreeBoatCreation(user2Points, user2Field)
    userFourBoatCreation(user2Points, user2Field)
    startGame(user2Field)
    displayField(user2Field)
    println("Нажмите Enter для начала игры")
    readln()
    repeat(100) { println() }

    makeCopy(userPoints, user2Points)

    while(userPoints.isNotEmpty() && user2Points.isNotEmpty()) {
        userChoice(user2Copy, user2Points)
        userChoice(userCopy, userPoints)
    }

    if (userPoints.isEmpty())
        println("Второй игрок выиграл")
    else
        println("Первый игрок выиграл")



//    repeat(100) { println() }



}