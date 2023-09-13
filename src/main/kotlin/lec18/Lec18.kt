package lec18

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_200),
        Fruit("사과", 1_000),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
    )

    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1, "사과", 1_200),
            Fruit(2, "사과", 1_000),
            Fruit(3, "바나나", 3_000),
            Fruit(4, "바나나", 3_200),
        ),
        listOf(
            Fruit(5, "사과", 1_200),
            Fruit(6, "사과", 1_000),
            Fruit(7, "바나나", 3_000),
            Fruit(8, "바나나", 3_200),
        )
    )

    val apples1 = fruits.filter { fruit -> fruit.name == "사과" }
    val apples2 = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }

    val applePrices1 = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.price }

    val applePrices2 = fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.price
        }

//    val values = fruits.filter { fruit -> fruit.name == "사과" }
//        .mapNotNull { fruit -> fruit.nullOrValue() }

    val isAllApple = fruits.all {fruit -> fruit.name == "사과" }
    val isNoApple = fruits.none {fruit -> fruit.name == "사과" }
    val isAtLeastOneApple = fruits.any {fruit -> fruit.price >= 10_000 }
    val count = fruits.count()
    val fruitSorted = fruits.sortedBy { fruit -> fruit.price }
    val sortedByDescending = fruits.sortedByDescending { fruit -> fruit.price }
    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    val map1: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    val map2: Map<String, List<Int>> = fruits.groupBy ({ fruit -> fruit.name }, { fruit -> fruit.price })

    val map3: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }
    val map4: Map<Long, Int> = fruits.associateBy ({ fruit -> fruit.id }, { fruit -> fruit.price } )

    val map5: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
        .filter { (key, value) -> key == "사과"}

    // flatMap : List<List>> -> List
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.price == 1000}
    }

    val flatten: List<Fruit> = fruitsInList.flatten()
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}

