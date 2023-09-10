package lec14

fun main() {

    // map 선언
    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "Monday")

    oldMap[2] = "Tuesday"

    mapOf(1 to "Monday", 2 to "Tuesday")

    // 키로 반복
    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    // 엔트리로 반복
    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }

}