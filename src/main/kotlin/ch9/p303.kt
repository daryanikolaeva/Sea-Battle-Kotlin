package ch9

fun main() {
    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")

    val allPetsList: MutableList<String> = mutableListOf()
    allPetsList.addAll(petsLiam)
    allPetsList.addAll(petsSophia)
    allPetsList.addAll(petsNoah)
    allPetsList.addAll(petsEmily)



    println(allPetsList.size)

    val petsSet = allPetsList.toSet()
    if (allPetsList.size > petsSet.size)
        println(petsSet.size)


    var sortedListPets = petsSet.sorted()
    println(sortedListPets)



}