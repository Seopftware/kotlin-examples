package ch02

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>){
    val persons = listOf(Person("인섭"), Person("재원, age=24"))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("나이가 가장 많은 사람: $oldest")
}