package lec19

fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean) {}

typealias FruitFilter = (Fruit) -> Boolean
fun filterFruits2(
    fruits: List<Fruit>,
    filter: FruitFilter) {}

typealias FruitTMap = Map<String, Fruit>

fun main() {
    val person = Person("민휘", 100)
    val (name, age) = person

    // break
    val numbers = listOf(1, 2, 3, 4, 5)

    run {
        numbers.forEach { number ->
            if (number == 3) {
                return@run
            }
            println(number)
        }
    }

    // continue
    numbers.forEach { number ->
        if (number == 3) {
            return@forEach
        }
        println(number)
    }

    // 증첩 for 문 break
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@loop
            }
            print("${i} ${j}")
        }
    }

}