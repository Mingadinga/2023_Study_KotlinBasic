package lec03

fun main() {
    val person = Person("민휘", 10)
    println("이름: ${person.name}")

    val withoutIndent =
        """
            ABFDS
            asfas
            hfdgf
        """.trimIndent()
    println(withoutIndent)

    val str = "ABC"
    println(str[0])
    println(str[2])
}

fun printAgeIfPerson(obj: Any?) {
    if (obj is Person) {
        val person: Person? = obj
        println(person?.age)
    }
}