package lec14

fun main() {
    // 선언
    val numbers = mutableSetOf(100L) // LinkedHashSet

    // for each
    for (number in numbers) {
        println(number)
    }

    // 전통적인 for문
    for ((idx, value) in numbers.withIndex()) {
        println("${idx} : ${value}")
    }
}