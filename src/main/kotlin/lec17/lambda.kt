package lec17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_200),
        Fruit("사과", 1_000),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
    )

    // 타입 : (Fruit) -> Boolean
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다 문법
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }

    // 호츨
    isApple(Fruit("사과", 1_200))
    isApple.invoke(Fruit("바나나", 3_000))

    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }
    filterFruits(fruits) { fruit -> fruit.name == "사과" }
    filterFruits(fruits) { it.name == "사과" }


}

// 함수 자체를 파라미터로 넘김
private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean)
: List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) results.add(fruit)
    }
    return results
}

