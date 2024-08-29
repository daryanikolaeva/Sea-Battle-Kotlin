package ch9


fun main() {
    val mList = mutableListOf("Football", "Baseball", "Basketball")

    mList.sort()
    println(mList) // [Baseball, Basketball, Football]

    val mMap = mutableMapOf("0" to "Netball")
    var x = 0
    for (item in mList) {
        mMap.put(x.toString(), item)
    }
    println(mMap.values) // [Basketball]

    mList.addAll(mList)
    mList.reverse()
    val set = mList.toSet()
    println(set) //[Basketball, Baseball, Football]

    mList.sort()
    mList.reverse()
    println(mList) //[Football, Basketball, Baseball]




}