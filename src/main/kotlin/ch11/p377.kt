package ch11

fun getConversionLambda (str: String): (Double)-> Double
{
    if (str == "CentigradeToFahrenheit")
    {
        return {it * 1.8 + 32}
    }
    else if (str =="KgsToPouds")
    {
        return {it * 2.204623}
    }
    else {
        return {it}
    }
}

fun main() {
    val pounds = getConversionLambda("KgsToPounds")(2.5)
    println(pounds)

    convert(20.0, getConversionLambda("CentigradeToFahrenheit"))
}