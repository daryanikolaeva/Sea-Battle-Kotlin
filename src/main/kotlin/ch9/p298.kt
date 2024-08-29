package ch9

fun main() {
    val mFriendSet = mutableSetOf("Jim", "Sue")
    mFriendSet.add("Nick")

    mFriendSet.remove("Nick")

    val toAdd = setOf("Joe","Mia")
    mFriendSet.addAll(toAdd)

    val friendSetCopy = mFriendSet.toSet()

    val friendList = mFriendSet.toList()

    val mShoppingList = listOf("Holly", "Dan")
    val shoppingSet = mShoppingList.toSet()

    if(mShoppingList.size > mShoppingList.toSet().size)
    {
        //mShopping содержит дубликаты
    }


    mFriendSet.clear()

}