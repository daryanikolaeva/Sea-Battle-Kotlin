package ch8

class BadException2: Exception()

fun function (test: String)
{
    try{
        print("t")
        print("h")
        riskyCode2(test)
    }
    catch(e: BadException2)
    {
        print("a")
    }
    finally {
        print("w")
        print("s")
    }
}

fun riskyCode2(test: String)
{
    if (test == "Yes")
        throw BadException2()
    print("r")
    print("o")
}

fun main() {
    function("No")
}