package lec20

fun printPersonV1(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

fun printPersonV2(person: Person?) {
    person?.let {
        println(person.name)
        println(person.age)
    }
}

fun main() {
    val person = Person("민휘", 24)

    val val1: Int = person.let {
        it.age
    }
    println(val1) // 24

    val val2: Int = person.run {
        this.age
    }
    println(val2) // 24

    val val3: Person = person.also {
        it.age
    }
    println(val3) // Person(name=민휘, age=24)

    val val4: Person = person.apply {
        this.age
    }
    println(val4) // Person(name=민휘, age=24)

    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 } // List<Int>
        .let { lengths -> println(lengths) }

    val str = strings[0]
    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    val modifiedFirstString = strings.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem"
        }.uppercase()
    println(modifiedFirstString)

//    val person: Person = Person("민휘", 24).run(personRepository::save)
//    val person: Person = Person("민휘", 24).run{
//        hobby = "독서"
//        personRepository.save(this)
//    }

    mutableListOf("one", "two", "three")
        .also { println("four 추가 이전 값: $it") }
        .add("four")

//    with(person) {
//        PersonDto(
//            name = name,
//            age = age
//        )
//    }

//    // 전통적인 if else
//    if (person != null && person.isAdult) {
//        view.showPerson(person)
//    } else {
//        view.showError()
//    }
//
//    // 코틀린 스러운 코드
//    person?.takeIf { it.isAdult }
//        ?.let { view::showPerson }
//        ?: view.showError()
//
}

fun createPerson(
    name: String,
    age: Int,
    hobby: String,
) : Person {
    return Person(
        name = name,
        age = age,
    ).apply {
        this.hobby = hobby
    }
}
