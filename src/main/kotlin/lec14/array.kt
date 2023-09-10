package lec14

fun main() {
    val array = arrayOf(100, 200)

    // index
    for (i in array.indices) {
        println("${i} : ${array[i]}")
    }

    // array with index
    for ((idx, value) in array.withIndex()) {
        println("${idx} : ${array[value]}")
    }

    // 배열에 값 추가
    array.plus(300)
}