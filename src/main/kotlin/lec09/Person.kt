package lec09

fun main() {
    var person = Person("최태현", 100)
    println(person.name)
    person.age = 10
    println(person.isAdult())

    var baby = Person("아기")

}

class Person(name: String,
             var age: Int = 1){

    var name = name
        get() = field.uppercase()
        set(value) { field = value.uppercase() }


    init {
        if (age <= 0)
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
    }

    constructor(name: String): this(name, 1)

    fun isAdult(): Boolean {
        return this.age >= 20;
    }

    val isAdult2: Boolean
        get() = this.age >= 20;

}