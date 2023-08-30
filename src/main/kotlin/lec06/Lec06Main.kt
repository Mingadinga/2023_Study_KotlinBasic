package lec06

fun main() {

}

fun forEach() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }
}

fun traditionalFor() {
    for (i in 1..3) {
        println(i)
    }
}

fun traditionalForStep() {
    for (i in 1..3 step 2) {
        println(i)
    }
}

fun traditionalDownFor() {
    for (i in 3 downTo 1) {
        println(i)
    }
}

fun whileTest() {
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}
