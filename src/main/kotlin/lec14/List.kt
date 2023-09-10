package lec14

fun main() {
    // 리스트 선언
    val numbers = mutableListOf(100, 200) // ArrayList 구현체 사용
    numbers.plus(300)
    val emptyList = emptyList<Int>()

    // 하나 가져오기
    numbers.get(0)
    numbers[0]

    // for each
    for (number in numbers) {
        println(number)
    }

    // 전통적인 for
    for ((idx, value) in numbers.withIndex()) {
        println("${idx} : ${value}")
    }
}