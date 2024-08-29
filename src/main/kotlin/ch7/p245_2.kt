package ch7

data class Student2(val firstName: String, val lastName:String,
    val house :String, val year: Int = 1)

fun main() {
    val s1 = Student2 ("Ron", "Weasley", "Gryffindor")
    //val s2 = Student2(lastName = "Malfoy", firstName = "Draco", year = 1) // house тоже должен быть инициализирован
    val s2 = Student2(lastName = "Malfoy", firstName = "Draco", year = 1, house = "Slytherin")
    val s3 = s1.copy(firstName = "Fred")
    //s3.year = 3 // свойство val нельзя изменять, но можно поменять значение с помощью copy()
    val s4 = s3.copy(firstName = "George")

    val array = arrayOf(s1,s2,s3,s4)
    for(s in array)
    {
        println("${s.firstName} ${s.lastName} is in ${s.house} year ${s.year}")
    }
}