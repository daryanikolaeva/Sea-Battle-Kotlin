package ch3

fun main() {
    val options = arrayOf("Rock","Paper","Scissors")
    updateArray(options)
    println(options[2])
}

fun updateArray(optionsParam:Array<String>)
{
    optionsParam[2]="Fred"
}
